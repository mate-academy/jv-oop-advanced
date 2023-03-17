package core.basesyntax;

abstract class AbstractFigure implements Figure {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String draw() {
        return "";
    }

}
