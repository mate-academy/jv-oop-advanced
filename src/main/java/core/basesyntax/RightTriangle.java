package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leg1;
    private final int leg2;
    private String color = super.getColor();

    public RightTriangle(int leg1, int leg2, String color) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) (leg1 * leg2) / 2;
    }

    @Override
    public String getInfo() {
        return "Figure : Right Triangle, Color : " + color
                + ", Leg1 : " + leg1
                + ", Leg2 : " + leg2
                + ", Area : " + getArea();
    }
}
