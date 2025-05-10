package core.basesyntax;

public class IsoscelesTapezoid extends Figure {
    private double base1;
    private double base2;
    private double leg;
    private double height;

    public IsoscelesTapezoid(double base1, double base2, double leg, double height, Color color) {
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Tapezoid \n"
                + " base1: " + base1
                + " base2: " + base2
                + " leg: " + leg
                + " color:" + getColor()
                + " area: " + getArea());
    }
}
