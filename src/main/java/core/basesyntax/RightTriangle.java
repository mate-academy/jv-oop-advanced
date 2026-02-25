package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double hypotenuse;

    public RightTriangle(double firstLeg, double secondLeg, double hypotenuse, String color) {
        this.setColor(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double calcArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure : isosceles trapezoid, "
                + "area: " + calcArea() + " sq. units, "
                + "first leg :" + firstLeg + " units, "
                + "second leg:" + secondLeg + " units, "
                + "hypotenuse :" + hypotenuse + " units, "
                + "color : " + getColor());
    }
}
