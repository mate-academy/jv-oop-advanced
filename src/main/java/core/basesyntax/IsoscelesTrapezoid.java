package core.basesyntax;

public class IsoscelesTrapezoid extends Default {
    private double size;
    private double side1;
    private double side2;
    private double length;

    public IsoscelesTrapezoid(String color, double size, double side1,
                              double side2, double length) {
        super(color);
        this.size = size;
        this.side1 = side1;
        this.side2 = side2;
        this.length = length;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public double getProperty() {
        return 0.5 * (side1 * side2) * length;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid: area: " + Math.round(getArea())
                + ", Property: " + Math.round(getProperty())
                + ", Color: " + getColor() + ", side1: " + Math.round(side1)
                + ", side2: " + Math.round(side2)
                + ", length: " + Math.round(length));
    }
}
