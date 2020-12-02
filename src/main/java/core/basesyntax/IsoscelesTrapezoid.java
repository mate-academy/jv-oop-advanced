package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private int sideLength;
    private int widthA;
    private int widthB;

    public IsoscelesTrapezoid(int sideLength, int widthA, int widthB, Color color) {
        this.sideLength = sideLength;
        this.widthA = widthA;
        this.widthB = widthB;
        this.color = color;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Draw the isosceles trapezoid");
    }

    @Override
    public double getArea() {
        return (double) (widthA + widthB) / 2
                * Math.sqrt(sideLength * sideLength - Math.pow((widthA - widthB), 2) / 4);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape: isosceles trapezoid, area: "
                + getArea()
                + " sq. units, side length: "
                + sideLength
                + " units, color: "
                + color;
    }
}
