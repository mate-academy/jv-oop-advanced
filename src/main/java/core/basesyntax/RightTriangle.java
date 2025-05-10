package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(String color, int leg1, int leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public int getLeg1() {
        return leg1;
    }

    public void setLeg1(int leg1) {
        this.leg1 = leg1;
    }

    public int getLeg2() {
        return leg2;
    }

    public void setLeg2(int leg2) {
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (leg1 + leg2) / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "leg1: " + getLeg1() + " units, "
                + "leg2: " + getLeg2() + " units, "
                + "color: " + getColor());
    }
}
