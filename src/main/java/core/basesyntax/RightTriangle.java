package core.basesyntax;

public class RightTriangle implements Area, Draw {
    private double baseTriangle;
    private double heightTriangle;
    private String color;

    public double getBaseTriangle() {
        return baseTriangle;
    }

    public double getHeightTriangle() {
        return heightTriangle;
    }

    public void getRightTriangle(int baseTriangle, int heightTriangle, String color) {
        this.baseTriangle = baseTriangle;
        this.heightTriangle = heightTriangle;
        this.color = color;
        draw();
    }

    @Override
    public double getArea() {
        return baseTriangle * heightTriangle / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.units, "
                + "baseTriangle: " + getBaseTriangle()
                + ", heightTriangle: " + getHeightTriangle() + " units, color: " + color);
    }
}
