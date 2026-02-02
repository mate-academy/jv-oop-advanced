package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    IsoscelesTrapezoid(Color enumColor,double height,double firstBase,double secondBase) {
        super(enumColor.toString());
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "Isosceles Trapezoid," + "Area: ");
        System.out.println(getArea() + ",Color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height * 0.5;
    }
}
