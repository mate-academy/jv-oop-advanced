package core.basesyntax;

public enum FigureType {
    SQUARE("square"),
    RECTANGLE("rectangle"),
    RIGHT_TRIANGLE("right triangle"),
    CIRCLE("circle"),
    ISOSCELES_TRAPEZOID("isosceles trapezoid");

    private String value;

    FigureType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
