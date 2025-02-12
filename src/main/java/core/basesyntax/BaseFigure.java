package core.basesyntax;

public abstract class BaseFigure implements Figure {
    protected String color;

    public BaseFigure(String color) {
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a figure with color: " + color);
    }
    @Override
    public abstract double getArea();
}
