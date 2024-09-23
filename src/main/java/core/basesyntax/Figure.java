package core.basesyntax;

public abstract class Figure implements Picture {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return 1.;
    }
}
