package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public double getLeg1() {
        return leg1;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        double area = leg1 * leg2 / 2;
        double scale = Math.pow(10, 3);
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public String draw() {
        int index = this.getClass().getName().lastIndexOf(".");
        String name = this.getClass().getName().substring(index + 1);
        String figure = "Figure: " + name + ", area: " + this.getArea() + ", sq. units, leg 1: "
                + this.leg1 + " units, leg 2: " + this.leg2 + " units, color: " + this.getColor();
        return figure;
    }
}
