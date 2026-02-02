package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    IsoscelesTrapezoid(String enumColor, double height, double firstBase, double secondBase) {
        super(enumColor);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "isosceles trapezoid," + "area:" + getArea() + " sq. units ");
        System.out.print("base 1:" + this.firstBase + " units," + "base 2:" + this.secondBase);
        System.out.print(" units," + "height: " + this.height + " units," + "Color:");
        System.out.println(getColor());
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height * 0.5;
    }
}
