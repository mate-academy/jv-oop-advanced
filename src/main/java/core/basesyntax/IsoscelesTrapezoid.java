package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private double sideA;
    private double sideB;
    private double leg;
    private double height;


    //This method calculates the height of Isosceles Trapezoid.
    private double heightCalculate(double a, double b, double c) {
        double height = 0;
        if (a > b) {
            height = 0.5 * Math.sqrt((4 * c * 4 * c) - (a - b) * (a - b));
            return height;
        } else {
            height = 0.5 * Math.sqrt((4 * c * 4 * c) - (b - a) * (b - a));
            return height;
        }

    }

    public IsoscelesTrapezoid(double sideA, double sideB, double leg, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.leg = leg;
        this.setName("Isosceles Trapezoid");
        this.height = this.heightCalculate(sideA, sideB, leg);
    }

    @Override
    double area() {
        return height / 2 * (sideA + sideB);
    }

    @Override
    void draw() {
        System.out.println("Figure: " + this.getName() + ", area: " + String.format("%.2f", this.area()) + " sq.units, " +
                "first side: " + String.format("%.2f", sideA) + " units, second side: " + String.format("%.2f", sideB) + " units, leg: " +
                String.format("%.2f", leg) + " units, height: " + String.format("%.2f", height) + " units, color: " + getColor());
    }
}
