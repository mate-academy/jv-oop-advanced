package core.basesyntax;

public class RightTriangle extends Figure {
    private int base;
    private int height;
    private double hypotenuse;

    public RightTriangle(int base, int height, String color) {
        this.height = height;
        this.base = base;
        this.color = color;
        this.area = area();
        this.hypotenuse = Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2)));
    }

    @Override
    public double area() {
        return (base * height) / (double) 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units, hypotenuse: %.1f units,"
                + " base: %d, height: %d color: %s%n", area, hypotenuse, base, height, color);
    }
}
