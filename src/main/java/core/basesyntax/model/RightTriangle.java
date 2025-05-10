package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int base;
    private int heigth;

    public RightTriangle(String color, int base, int heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return base * heigth / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq. units, color: " + getColor() + ", base: "
                + getBase() + ", height: " + getHeigth());
    }
}
