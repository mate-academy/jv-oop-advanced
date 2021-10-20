package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int base;
    private int height;
    private int top;

    public IsoscelesTrapezoid(String color) {
        this.setColor(color);
    }

    public IsoscelesTrapezoid(String color, int base, int height, int top) {
        this.setColor(color);
        this.base = base;
        this.height = height;
        this.top = top;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public double getArea() {
        return (double) (this.height / 2) * (this.top + this.base);
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq.units, base: " + this.getBase() + " units, height: "
                + this.getHeight() + " units, top: " + this.getTop()
                + " units, color: " + this.getColor());
    }
}
