package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double parameter, double secondBase, double height) {
        super(color, parameter);
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (getParameter() + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid " + getArea()
                + " sq.units, first base: " + getParameter()
                + " units, second base: " + secondBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
