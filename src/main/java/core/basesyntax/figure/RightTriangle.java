package core.basesyntax.figure;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: "
                + getArea() + " sq. units, color: " + getColor()
                + ", base: " + base
                + ", height: " + height);
    }
}
