package core.basesyntax.model;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = height * width;
        return Math.round(area * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(super.getClass().getSuperclass().getName()
                + ": rectangle, "
                + "area: " + calculateArea() + " sq.units, "
                + "height: " + height + " units"
                + ", width: " + width + " units"
                + ", color: " + getColor());
    }
}
