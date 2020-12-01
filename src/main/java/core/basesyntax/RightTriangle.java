package core.basesyntax;

public class RightTriangle extends Shape {
    private double legA;
    private double legB;

    public RightTriangle() {
        super();
        this.legA = (int) Math.random() * (11 - 1) + 1;
        this.legB = (int) Math.random() * (11 - 1) + 1;
    }

    @Override
    public double getArea() {
        double s = (legA + legB + getHypotenuse()) / 2; // Heron
        return Math.sqrt(s * (s - legA) * (s - legB) * (s - getHypotenuse()));
    }

    @Override
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, perimeter: " + getPerimeter() +
                ", area: " + getArea() +
                " sq. units, legA: " + getLegA() +
                " units, legB: " + getLegB() +
                " units, hypotenuse: " + getHypotenuse() +
                " units, color: " + getColor() + ".");
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}
