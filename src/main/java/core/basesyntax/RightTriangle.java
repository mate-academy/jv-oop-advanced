package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg1;
    private int leg2;

    public RightTriangle(String color) {
        super(color);
    }

    @Override
    public void areaObtain() {
        setArea((double) (leg1 * leg2) / 2);
    }

    @Override
    public void drow() {
        System.out.println("Figure: Circle, color: " + getColor()
                + " leg1: " + leg1 + " leg2: " + leg2 + ", area: " + getArea());

    }
}
