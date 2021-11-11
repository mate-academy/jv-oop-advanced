package core.basesyntax;

public enum FigureType {
    SQUARE("square"),
    RECTANGLE("rectangle"),
    CIRCLE("circle"),
    RIGHT_TRIANGLE("right triangle"),
    ISOSCELES_TRAPEZOID("isosceles trapezoid");

    private String name;

    FigureType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
