package March_12.prob1;
import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;
    public MyPersonList() {
        this.currentArray = new Person[INITIAL_LENGTH];
        this.numOfElements = 0;
    }

    public void add(Person p) {
        if (p == null) return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        currentArray[numOfElements] = p;
        numOfElements++;
    }

    public Person get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }
    private void resize() {
        System.out.println("Resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person[] newArray = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean isEmpty() {
        return (numOfElements == 0);
    }

    public boolean find(String lastName) {
        if (lastName == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(lastName))
                return true;
        }
        return false;
    }

    public void insert(Person p, int pos) {
        if (p == null) return;
        if (pos > numOfElements || pos < 0) return;
        if (numOfElements == currentArray.length)
            resize();
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = p;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        numOfElements++;
    }
    public boolean remove(String lastName) {
        if (numOfElements == 0) return false;
        if (lastName == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(lastName)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        numOfElements--;
        return true;
    }

    //
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; i++) {
            sb.append(currentArray[i].toString()).append(", ");
        }
        sb.append(currentArray[numOfElements - 1].toString()).append("]");
        return sb.toString();
    }

    public int size() {
        return numOfElements;
    }

    public Object clone() {
        Person[] temp = Arrays.copyOf(currentArray, numOfElements);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList personList = new MyPersonList();
        personList.add(new Person("Doe", "John", 30));
        personList.add(new Person("Smith", "Alice", 25));
        personList.add(new Person("Johnson", "Bob", 35));
        personList.insert(new Person("Jones", "Mary", 28), 2);
        personList.insert(new Person("Brown", "Michael", 40), 3);

        System.out.println("Find: " + personList.find("Doe"));
        System.out.println("At index 3: " + personList.get(3));

        personList.remove("Jones");
        personList.remove("Doe");

        System.out.println(personList.toString());
    }
}
