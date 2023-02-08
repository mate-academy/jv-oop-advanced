package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg;
    private int hypotenuse;

    public RightTriangle(String color, int leg, int hypotenuse) {
        this.color = color;
        this.leg = leg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return (leg * hypotenuse) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq.units, leg: " + leg
                + " units, hypotenuse: " + hypotenuse
                + " units, color: " + color.toLowerCase());
    }
}
