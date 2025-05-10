package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double side1;
    private double side2;
    private double height;

    public IsoscelesTrapezoid(String name, String color,
                              double side1, double side2, double height) {
        super(name, color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHeight() {
        return height;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (side1 + side2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName() + ", area: " + area() + " sq. units, "
                          + "side 1: " + side1 + ", units" + ", side 2: " + side2 + " units, "
                          + ",color: " + super.getColor());
    }
}
