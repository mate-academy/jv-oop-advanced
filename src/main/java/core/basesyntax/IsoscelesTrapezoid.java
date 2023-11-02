package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private int sideB;
    private int height;
    private String color;

    public IsoscelesTrapezoid(int sideA,int sideB,int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2 * height);
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, height: " + height
                + " units, color: " + color;
    }

}
