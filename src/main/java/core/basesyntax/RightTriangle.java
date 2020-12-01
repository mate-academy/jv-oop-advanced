package core.basesyntax;

public class RightTriangle extends Figure implements HasBisector {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public static RightTriangle generateFigure() {
        return new RightTriangle(Colors.randomColor().name().toLowerCase(),
                (int)(Math.random() * 15) + 3, (int)(Math.random() * 15) + 3);
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: right triangle, area: %.3f sq. units, side A length: %s units,"
                + " side B length: %s units, bisector length: %.3f units, color: %s",
                getArea(), sideA, sideB, getBisector(), getColor());
        System.out.println();
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " right triangle!");
    }

    @Override
    public double getBisector() {
        return Math.sqrt(2) * (sideB * sideA) / (sideB + sideA);
    }
}
