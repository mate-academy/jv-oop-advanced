package core.basesyntax.figure;

public class Rectangle extends FigureWithHeight {
    private final double width;

    public Rectangle(String color, double height, double width) {
        super(color, height);
        this.width = width;
    }

    @Override
    public double getArea() {
        return getHeight() * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, height: " + super.getHeight() + " units, "
                + "width: " + width
                + " units, color: " + super.getColor());
    }
}
