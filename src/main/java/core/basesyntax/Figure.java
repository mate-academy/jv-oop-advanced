package core.basesyntax;

public abstract class Figure implements CommonInformation {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    abstract String getName();

    abstract double area();

    String getColor() {
        return color;
    }
}
