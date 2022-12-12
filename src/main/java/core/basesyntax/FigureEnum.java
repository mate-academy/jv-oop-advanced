package core.basesyntax;

public enum FigureEnum {
    CIRCLE("circle"),
    ISOSCELES_TRAPEZOID("isosceles trapezoid"),
    RECTANGLE("rectangle"),
    RIGHT_TRIANGLE("right triangle"),
    SQUARE("square");

    private final String value;

    FigureEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
