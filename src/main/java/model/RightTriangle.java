package model;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(int leg1, int leg2, String color) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        setColor(color);
    }

    public RightTriangle() {
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ",area: " + getArea()
                + "sq.units,Leg1: " + leg1 + "units,Leg2: " + leg2 + "units,color: " + getColor());
    }
}
