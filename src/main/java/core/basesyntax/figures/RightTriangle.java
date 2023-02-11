package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int lenght;
    private int width;

    public RightTriangle(String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double getArea() {
        return lenght * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + ", length: " + lenght + ", width: " + width + ", color: " + getColor());
    }
}
