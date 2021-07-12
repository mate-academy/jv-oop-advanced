package core.basesyntax;

public class RightTriangle extends BaseFigure implements Behaviour {
    private int base;
    private int height;

    public RightTriangle(int base, int height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle with color: "
                + getColor() + ", base: "
                + base + " and height: "
                + height);
    }
}
