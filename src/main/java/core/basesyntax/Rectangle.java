package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private int firstSide;
    private int secondSide;

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color:" + color);
    }
}
