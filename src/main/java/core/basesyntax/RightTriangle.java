package core.basesyntax;

public class RightTriangle extends Figure {
    private double length;
    private double height;

    public RightTriangle(String color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (length * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle "
                + "area: " + calculateArea() + " sq. units, "
                + "length: " + length + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().toLowerCase());
    }
}
