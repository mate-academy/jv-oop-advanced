package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int base;
    private int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
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

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor() + ", base: "
                + getBase() + ", height: " + getHeight());
    }
}
