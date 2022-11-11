package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements DrawFigure {

    private int sideA, sideB, height;

    public IsoscelesTrapezoid (int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println();
    }

    @Override
    public double getArea() {
        double area = 0.5 * sideB * sideA;
        return area;
    }
}
