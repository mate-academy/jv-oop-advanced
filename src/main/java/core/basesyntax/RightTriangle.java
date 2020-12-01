package core.basesyntax;

public class RightTriangle extends Shape implements Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    @Override
    public void draw() {
        System.out.println("Draw the right triangle");
    }

    @Override
    public double getArea() {
        return (double) sideA * sideB / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "right triangle, area: "
                + getArea()
                + " sq. units, hypotenuse: "
                + getHypotenuse()
                + " units, color: "
                + color;
    }
}
