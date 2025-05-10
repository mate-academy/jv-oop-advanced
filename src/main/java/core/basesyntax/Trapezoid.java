package core.basesyntax;

public class Trapezoid extends Figure {
    private int height;
    private int top;
    private int base;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) getHeight() * (getTop() + getBase()) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + this.getClass().getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, height: " + getHeight() + " units, base: "
                + getBase() + " units, top: " + getTop() + " units, color: " + getColor();
    }
}
