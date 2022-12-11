package core.basesyntax;

public enum FigureList {
    CIRCLE("circle"),
    ISOSCELES_TRAPEZOID("isosceles trapezoid"),
    RECTANGLE("rectangle"),
    RIGHT_TRIANGLE("right triangle"),
    SQUARE("square");

    private final String value;

    FigureList(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
