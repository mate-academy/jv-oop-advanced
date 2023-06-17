package core.basesyntax;

public enum Shape {
    CIRCLE,
    ISOSCELES_TRAPEZOID("Isosceles Trapezoid"),
    RECTANGLE,
    RIGHT_TRIANGLE("Right Triangle"),
    SQUARE;

    private String description;

    Shape() {
    }

    private Shape(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description != null ? description : name();
    }
}
