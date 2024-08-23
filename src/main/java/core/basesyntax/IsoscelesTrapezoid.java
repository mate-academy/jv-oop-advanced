package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private String color;
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, firstSide: " + firstSide
        + " units, secondSide: " + secondSide + " units, height: " + height + " units, color:" + color);
    }
}
