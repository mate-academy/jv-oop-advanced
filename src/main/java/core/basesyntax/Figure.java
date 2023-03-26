package core.basesyntax;

public abstract class Figure implements AreaCalculate, Drawable {
    private int height;
    private int side;
    private int radius;
    private int parallelSideA;
    private int parallelSideB;
    private int width;

    protected Figure() {
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public int getParallelSideA() {
        return parallelSideA;
    }

    public int getParallelSideB() {
        return parallelSideB;
    }

    public int getWidth() {
        return width;
    }

    public int getSide() {
        return side;
    }

    ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
