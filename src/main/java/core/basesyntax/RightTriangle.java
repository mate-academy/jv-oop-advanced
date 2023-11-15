package core.basesyntax;

public class RightTriangle extends Figure {
    private final double base;
    private final double hipotenuse;
    private final double height;

    public RightTriangle(Color color, double base, double hipotenuse, double height) {
        super(color);
        this.base = base;
        this.hipotenuse = hipotenuse;
        this.height = height;
    }

    public double getArea() {
        return round((base * height) / 2);
    }

    public double getPerimeter() {

        return round(height + base + hipotenuse);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle"
                        + ", base: " + round(base) + " units"
                        + ", hipotenuse: " + round(hipotenuse) + " units"
                        + ", height: " + round(height) + " units"
                        + ", area: " + getArea() + " sq. units"
                        + ", perimeter: " + getPerimeter() + " units"
                        + ", color: " + color
        );
    }
}
