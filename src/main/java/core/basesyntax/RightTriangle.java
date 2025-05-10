package core.basesyntax;

public class RightTriangle extends Figure {
    private int legOne;
    private int legTwo;

    public RightTriangle(String color, int length, int lengthTwo) {
        super("right triangle", color);
        this.legOne = length;
        this.legTwo = lengthTwo;
    }

    @Override
    public double getArea() {
        double area = legOne * legTwo / 2;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, leg one: "
                + legOne + " units, leg two: " + legTwo + " units, color: " + color + ".");
    }
}
