package March_05;

public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    // Returns the String that is matched with char c in the table
    public String get(char c) {
        int index = charToIndex(c);
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].str;
        } else {
            return null;
        }
    }

    // Adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s) {
        int index = charToIndex(c);
        Entry newEntry = new Entry(c, s);

        if (index >= 0 && index < entries.length) {
            if (entries[index] == null) {
                entries[index] = newEntry;
            } else {
                // Handle collision by adding the new entry to the next available position
                index = findNextAvailableIndex(index);
                if (index != -1) {
                    entries[index] = newEntry;
                } else {
                    System.out.println("Table is full. Unable to add entry for character " + c);
                }
            }
        } else {
            System.out.println("Invalid character: " + c);
        }
    }

    // Returns a String consisting of a nicely formatted display of the contents of the table
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                result.append(entry.toString()).append("\n");
            }
        }
        return result.toString().trim();
    }

    private int charToIndex(char c) {
        // Map 'a' to index 0, 'b' to index 1, and so on
        return Character.toLowerCase(c) - 'a';
    }

    private int findNextAvailableIndex(int currentIndex) {
        for (int i = currentIndex + 1; i < entries.length; i++) {
            if (entries[i] == null) {
                return i;
            }
        }
        return -1; // No available index found
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        // Returns a String of the form "ch->str"
        public String toString() {
            return ch + "->" + str;
        }
    }
}
