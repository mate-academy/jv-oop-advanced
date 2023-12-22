package core.basesyntax;

public abstract class Figure implements Printable {
    protected String color;
    protected String name;

    public abstract double calculateArea();

    public abstract void generateRandomParameters();

    public abstract void generateDefaultParameters();

    public void printInfo() {

    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
