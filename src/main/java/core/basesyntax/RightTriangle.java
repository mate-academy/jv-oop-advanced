package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private int base;
    private int height;

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Figure: triangle, area: " + this.getArea() + " sq. units, side length: " + this.base
                + " units, color: " + this.getColor();
    }
}
