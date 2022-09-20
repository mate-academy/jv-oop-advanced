package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double height;

    public RightTriangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: right triangle; Base: %f, Height: %f; Area: %f; Color: %s\n",
                base, height, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
