package core.basesyntax.figure;

public class Rectangle extends AbstractFigure implements Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq. units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + color);
    }
}
