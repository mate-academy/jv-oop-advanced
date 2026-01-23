package core.basesyntax;

public class Rectangle implements Behavior {
    private String color;
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, side1: " + firstSide + " units, side2: " + secondSide + " units, color: " + color);
    }
}
