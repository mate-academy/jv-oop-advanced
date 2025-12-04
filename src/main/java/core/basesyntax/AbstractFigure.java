package core.basesyntax;

public abstract class AbstractFigure implements Figure {

    protected String color;

    protected AbstractFigure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();

    protected abstract String getParametersString();
}

