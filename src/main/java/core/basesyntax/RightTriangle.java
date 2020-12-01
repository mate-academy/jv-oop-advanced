package core.basesyntax;

public class RightTriangle extends Shape implements Figure {
    private int sideA;
    private int sideB;
    private String color;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public double getHypotenuse() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public void draw() {
        System.out.println("Draw the right triangle");
    }

    public double getArea() {
        return (double) sideA * sideB / 2;
    }

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
