package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private String color;
    private int firstSide;
    private int secondSide;
    private int height;

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, firstSide: " + firstSide
        + " units, secondSide: " + secondSide + " units, height: " + height + " units, color:" + color);
    }
}
