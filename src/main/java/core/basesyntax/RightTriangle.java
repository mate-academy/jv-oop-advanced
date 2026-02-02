package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double a, double b) {
        super(color.toString());
        this.firstLeg = a;
        this.secondLeg = b;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "right triangle," + "area:" + getArea() + "sq. units ");
        System.out.println("first leg: " + this.firstLeg + "units," + "second leg: ");
        System.out.println(this.secondLeg + "units," + "Color:" + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
