package core.basesyntax;

public class Rectangle extends FigureAbstract implements Figure {
    private double width;
    private double height;
    public Rectangle(Color color, double width, double heigth) {
        super(color);
        this.width = width;
        this.height = heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + ", width: " + width + ", height: " + height + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
