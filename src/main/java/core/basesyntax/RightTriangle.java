package core.basesyntax;

public class RightTriangle extends Figure implements Areacount {
    private int base;
    private int height;

    public RightTriangle(int base, int height,String color) {
        this.base = base;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public String toString() {
        return "RightTriangle{" + "area: " + getArea() + " || " + "color: " + getColor() + '}';
    }
}
