package core.basesyntax;

public class IsoscelesTrapezoid extends Shape implements Figure {
    private int sideLength;
    private int widthA;
    private int widthB;
    private String color;

    public IsoscelesTrapezoid(int sideLength, int widthA, int widthB, String color) {
        this.sideLength = sideLength;
        this.widthA = widthA;
        this.widthB = widthB;
        this.color = color;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void draw() {
        System.out.println("Draw the isosceles trapezoid");
    }

    public double getArea() {
        return (double) (widthA + widthB) / 2
                * Math.sqrt(sideLength * sideLength - Math.pow((widthA - widthB), 2) / 4);
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "isosceles trapezoid, area: "
                + getArea()
                + " sq. units, side length: "
                + sideLength
                + " units, color: "
                + color;
    }
}
