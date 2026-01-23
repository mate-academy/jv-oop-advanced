package core.basesyntax;

public class RightTriangle implements Behavior{
    private String color;
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, side1: " + firstSide + " units, side2: " + secondSide + " units, color: " + color);
    }
}
