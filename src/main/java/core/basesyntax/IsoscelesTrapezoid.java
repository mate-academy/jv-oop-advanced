package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase,
                              double height, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is Isosceles Trapezoid. First base = " + firstBase
                + "; second base = " + secondBase + "; height = " + height
                + "; area = " + this.getArea() + "; color is " + getColor());
    }
}
