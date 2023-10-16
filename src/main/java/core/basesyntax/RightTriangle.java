package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(String color, int leg1, int leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return ((double) (leg1 * leg2) / 2);
    }

    @Override
    public void drow() {
        System.out.println("Figure: Circle, color: " + getColor()
                + " leg1: " + leg1 + " leg2: " + leg2 + ", area: " + getArea());

    }
}
