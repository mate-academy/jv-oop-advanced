package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int height;
    public int base;
    private int baseTop;

    public IsoscelesTrapezoid(String color, int height, int base, int baseTop) {
        super(color);
        this.height = height;
        this.base = base;
        this.baseTop = baseTop;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBaseTop() {
        return baseTop;
    }

    public void setBaseTop(int baseTop) {
        this.baseTop = baseTop;
    }

    @Override
    public double getArea() {
        return 0.5 * (base + baseTop) * height;
    }

    @Override
    public String draw() {
        return "Figure: isoscelesTrapezoid" + ", " + "area: " + String.format("%.1f",getArea()) +" sq.units" + ", " + "height: " + height + " units" + ", " + "base: " + base + " units" + ", "+ "baseTop: " + baseTop + " units" + ", " + "color: " + getColor().toLowerCase();
    }
}
