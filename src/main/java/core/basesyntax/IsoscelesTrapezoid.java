package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int leg;
    private int base;

    public IsoscelesTrapezoid(String color, String name) {
        setColor(color);
        setName(name);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void draw() {
        super.draw();
    }
}
