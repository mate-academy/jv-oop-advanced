package core.basesyntax;

public enum Shape {
    SQUARE("square"),
    RECTANGLE("rectangle"),
    RIGHT_TRIANGLE("right triangle"),
    CIRCLE("circle"),
    ISOSCELES_TRAPEZOID("isosceles trapezoid");

    private final String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return shapeName;
    }
}
