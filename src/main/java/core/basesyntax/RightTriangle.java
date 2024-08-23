package core.basesyntax;

public class RightTriangle implements  Figure {
    private String color;
    private int firstSide;
    private int secondSide;

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    public RightTriangle(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void getInfo() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide + " units, color:" + color);
    }
}
