package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements DrawFigure, GetArea {

    private int sideA, sideB, height;

    public IsoscelesTrapezoid (int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: IsoscelesTrapezoid, area:" + this.getArea() + " sq.units, sideA: " + this.sideA + "units, sideB: " + this.sideB + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        double area = 0.5 * sideB * sideA;
        return area;
    }
}
