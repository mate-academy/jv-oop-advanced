package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private int base;
    private int height;
    private int upperSide;

    public IsoscelesTrapezoid(String color, int femur, int height, int upperSide) {
        this.color = color;
        this.base = femur;
        this.height = height;
        this.upperSide = upperSide;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid has " + color
                + " color and femur length " + base
                + ". Area is " + getArea());
    }

    @Override
    public int getArea() {
        return (base + upperSide) / 2 * height;
    }
}
