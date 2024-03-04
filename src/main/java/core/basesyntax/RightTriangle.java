package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(String color, double base, double height, double hypotenuse) {
        super(color);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return super.toString() + "base: " + base
                + ", height: " + height
                + ", hypotenuse: " + hypotenuse
                + ", area: " + getArea();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
