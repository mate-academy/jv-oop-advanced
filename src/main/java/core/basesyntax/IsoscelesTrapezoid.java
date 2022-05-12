package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double leg;
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double leg, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.leg = leg;
        this.setName("Isosceles Trapezoid");
        this.height = this.heightCalculate(sideA, sideB, leg);
    }

    //This method calculates the height of Isosceles Trapezoid.
    private double heightCalculate(double a, double b, double c) {

        if (a > b) {
            return 0.5 * Math.sqrt((4 * c * 4 * c) - (a - b) * (a - b));
        } else {
            return 0.5 * Math.sqrt((4 * c * 4 * c) - (b - a) * (b - a));
        }
    }

    @Override
    public double getArea() {
        return height / 2 * (sideA + sideB);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: "
                + String.format("%.2f", this.getArea())
                + " sq.units, " + "first side: " + String.format("%.2f", sideA)
                + " units, second side: " + String.format("%.2f", sideB) + " units, leg: "
                + String.format("%.2f", leg) + " units, height: "
                + String.format("%.2f", height) + " units, color: " + getColor());
    }
}
