package core.basesyntax;

abstract class ColorFigure implements CountArea, Figure {
    private String color;

    public ColorFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
