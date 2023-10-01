package core.basesyntax.model;

public class RightTriangle extends Figure implements AreaCalculator {
    private int hight;
    private int base;

    public RightTriangle(String color, int hight, int base) {
        super(color);
        this.hight = hight;
        this.base = base;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (double) hight * base / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, hight: "
                + getHight() + " units, base: " + getBase() + " units, color: " + getColor());
    }
}
