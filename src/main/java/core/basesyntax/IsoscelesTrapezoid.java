package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements DrawArea{
    private int sideA;
    private int sideB;
    private int height;
    public IsoscelesTrapezoid (int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void drawArea() {
        System.out.println("Figure: isosceles trapezoid" + ", area: " + getArea() + " sq. units, sideA: " + sideA + " units, sideB: " + sideB + " units, heigth: " + height + " units, color: " + getColor());
    }
}
