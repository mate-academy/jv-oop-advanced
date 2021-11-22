package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg;
    private int base;

    public RightTriangle(String color, String name, int leg, int base) {
        super(color, name);
        this.leg = leg;
        this.base = base;
    }

    public int getLeg() {
        return leg;
    }

    public int getBase() {
        return base;
    }

    @Override
    public double area() {
        return 0.5 * leg * base;
    }

    @Override
    public void getFigureInfo() {
        System.out.println("Figure: " + getName() + ", area: " + area() + " sq. units, base: "
                + getBase() + ", leg: " + getLeg() + ", color: " + getColor());
    }
}
