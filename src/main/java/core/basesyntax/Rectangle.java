package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        this.height = height;
        this.width = width;
        super.setColor(color);
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return (double) (width * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + getArea() + " sq.units, "
                + "width: " + width + "units "
                + "height: " + height + " units "
                + "color: " + getColor());
    }
}
