package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side1;
    private double side2;
    private double height;

    public IsoscelesTrapezoid(Color color, double side1, double side2, double height) {
        super(color);
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

    @Override
    public double calculateArea() {
        return ((this.side1 + this.side2) * height / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + " sq.units, side_1: "
                + this.getSide1()
                + " units, side_2: "
                + this.getSide2()
                + " units, height: "
                + this.getHeight()
                + " units, color: "
                + this.getColor()
                + "\n");
    }
}
