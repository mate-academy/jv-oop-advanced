package core.basesyntax;

public class RightTriangle extends Figure implements Interface{
    private final double firstLeg, secondLeg;
    private final String name = "right triangle";

    RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public double getArea() {
        return (Math.round(firstLeg * secondLeg / 2) * 10.0) / 10.0;
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, first leg: " + firstLeg + " units, second leg: " + secondLeg + " units, color: " + color);
    }
}
