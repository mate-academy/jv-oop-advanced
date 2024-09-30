package core.basesyntax;

public class RightTriangle extends Figure {
    private int baseLength;
    private int height;

    public RightTriangle(String color, int height, int bothside) {
        super(color);
        this.height = height;
        this.baseLength = bothside;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle");
        System.out.println("Color: " + getColor());
        System.out.println("Both side length: " + baseLength);
        System.out.println("Height length: " + height);
    }

    @Override
    public double getArea() {
        return (double) (baseLength * height) / 2;
    }
}
