package March_4.ThirdAssignment;
import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    // Constructor to initialize the instance fields
    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }

    // Override equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize &&
                Double.compare(computer.processorSpeed, processorSpeed) == 0 &&
                Objects.equals(manufacturer, computer.manufacturer) &&
                Objects.equals(processor, computer.processor);
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}


