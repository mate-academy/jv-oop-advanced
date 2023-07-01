package core.basesyntax;

abstract class AbstractFigure implements Figure {
    private String color;

    double getArea() {
        return 0;
    }

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
