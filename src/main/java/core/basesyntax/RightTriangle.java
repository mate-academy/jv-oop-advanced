package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {

    private double leg1;
    private double leg2;

    public RightTriangle(String name, String color, double leg1, double leg2) {
        super(name, color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    @Override
    public double area() {
        return 0.5 * leg1 * leg2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName() + ", area: " + area() + " sq. units, "
                           + "leg 1: " + leg1 + " units, leg 2: " + leg2
                           + " units, color: " + super.getColor());
    }
}
