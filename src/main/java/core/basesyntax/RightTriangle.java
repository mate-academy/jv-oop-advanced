package core.basesyntax;

public class RightTriangle extends Figure {
    private double baseTriangle;
    private double heightTriangle;

    public RightTriangle(int baseTriangle, int heightTriangle, String color) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
        this.color = color;
    }

    @Override
    public double getArea() {
        return baseTriangle * heightTriangle / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, baseTriangle: " + baseTriangle
                + ", heightTriangle: " + heightTriangle + " units, color: " + color);
    }
}
