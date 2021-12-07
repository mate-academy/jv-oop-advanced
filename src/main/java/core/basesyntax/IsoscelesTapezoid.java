package core.basesyntax;

public class IsoscelesTapezoid extends Figure {
    private double base1;
    private double base2;
    private double leg;
    private double height;

    public IsoscelesTapezoid() {
        this.base1 = Math.random();
        this.base2 = Math.random();
        this.leg = Math.random();
        this.height = Math.random();
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
