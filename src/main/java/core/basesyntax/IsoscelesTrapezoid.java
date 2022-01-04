package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double sideA;
    private double sideC;

    public IsoscelesTrapezoid(double height, double sideA, double sideC, String color) {
        this.setColor(color);
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return Math.ceil((sideC + sideA) * height / 2 * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isoscelesTrapezoid"
                + ", area: " + calculateArea()
                + " sq.units, sideA: " + sideA
                + " units, sideC: " + sideC
                + " units, height: " + height
                + " units, color: " + getColor());
    }

}
