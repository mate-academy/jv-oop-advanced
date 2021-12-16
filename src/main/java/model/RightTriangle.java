package model;

public class RightTriangle extends Figure {
    private final int leg1;
    private final int leg2;

    public RightTriangle(int leg1, int leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public Object draw() {
        System.out.println("Figure:" + this.getClass().getSimpleName() + ",area:" + getArea()
                + "sq.units,firstLeg:" + leg1 + "units,secondLeg:" + leg2 + "units,color:" + color);
        return null;
    }
}
