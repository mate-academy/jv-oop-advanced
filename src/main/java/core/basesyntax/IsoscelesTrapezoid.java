package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int base;
    private int top;

    @Override
    public double getArea() {
        return (base + top) * Math.sqrt(Math.pow(leg, 2) - (Math.pow(base - top, 2) / 4));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " area: " + getArea()
                + " sq.units, leg: " + leg + " units, base: " + base + " units, top: " + top
                + " units, color: " + getColor());
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
