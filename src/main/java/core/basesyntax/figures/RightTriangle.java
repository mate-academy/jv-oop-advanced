package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double height;
    private double base;

    public RightTriangle(String color, double hight, double base) {
        super(color);
        this.height = hight;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq.units, color: " + getColor()
                + " ,base: " + base
                + " ,height: " + height);
    }
}
