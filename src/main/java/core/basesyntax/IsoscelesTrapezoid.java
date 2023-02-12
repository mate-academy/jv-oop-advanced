package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {

    private double firstLeg;
    private double secondLeg;
    private double side;
    private Color color;
    private double semiPerimeter = (firstLeg + secondLeg + side * 2) / 2;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double side, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        area = Math.sqrt(Math.pow((semiPerimeter - firstLeg) * (semiPerimeter - secondLeg)
                * (semiPerimeter - side), 2));
        return area;
    }

    @Override
    public String drawFigure() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + Math.floor(area) + " sq.units, "
                + "firstLeg: " + firstLeg + " units"
                + ", secondLeg: " + secondLeg + " units"
                + ", side: " + side + " units"
                + ", color: " + color.toString().toLowerCase());
        return null;
    }
}
