package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(int base, int height, String id, String color) {
        super(id, color);
        this.base = base;
        this.height = height;
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

    public int hypotenuse() {
        return (int) Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
    }

    @Override
    public void drawerFigure() {
        System.out.println("Figure:" + getId()
                + ", Area " + getAreaCalculate()
                + " sq, "
                + "hypotenuse: " + hypotenuse()
                + ", color " + getColor());
    }

    @Override
    public double getAreaCalculate() {
        return base * height / 2;
    }
}
