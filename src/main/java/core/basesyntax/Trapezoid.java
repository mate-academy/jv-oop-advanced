package core.basesyntax;

public class Trapezoid extends Figures {

    private int sideA;
    private int sideB;
    private int height;

    public Trapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Trapezoid, area:" + this.getArea() + " sq.units, sideA: "
                + sideA + "units, sideB: " + sideB + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        double area = 0.5 * height * (sideB + sideA);
        return area;
    }
}
