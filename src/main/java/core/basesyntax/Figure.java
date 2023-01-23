package core.basesyntax;

abstract class Figure implements AreaCalculator, PaintFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
