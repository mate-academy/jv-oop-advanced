package core.basesyntax;

public class Rectangle extends Figure implements HasDiagonal, Drawing {
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
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

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void infoAboutFigure() {
        System.out.printf("Shape: rectangle, area: %.2f sq. units, side A length: %s units,"
                        + " side B length: %s units, diagonal: %.3f units, color: %s",
                getArea(), sideA, sideB, getDiagonal(), getColor());
        System.out.println();
    }

    @Override
    public void drawFigure() {
        System.out.println(" You draw " + getColor() + " rectangle!");
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
