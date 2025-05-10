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
    public String drawFigure() {
        return "Figure:" + getId()
                + ", Area " + calculateArea()
                + " sq, "
                + "hypotenuse: " + hypotenuse()
                + ", color " + getColor();
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}
