package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() +
                ", area: " + getArea() + " sq. units" +
                ", color: " + color);
    }
}