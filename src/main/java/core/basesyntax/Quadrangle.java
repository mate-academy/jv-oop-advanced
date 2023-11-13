package core.basesyntax;

public abstract class Quadrangle extends Figure implements Area {
    private final int width;
    private final int height;

    public Quadrangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.print(" height: " + height + ", width: " + width);
        super.draw();
    }
}
