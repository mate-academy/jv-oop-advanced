package core.basesyntax;

public abstract class  AbstractFigure {

    protected String color;

    protected AbstractFigure() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public AbstractFigure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
