package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstValueSide;
    private double secondValueSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstValueSide,
                              double secondValueSide, double thigh) {
        super(color);
        this.firstValueSide = firstValueSide;
        this.secondValueSide = secondValueSide;
        this.height = thigh;
    }

    public double getFirstValueSide() {
        return firstValueSide;
    }

    public void setFirstValueSide(double firstValueSide) {
        this.firstValueSide = firstValueSide;
    }

    public double getSecondValueSide() {
        return secondValueSide;
    }

    public void setSecondValueSide(double secondValueSide) {
        this.secondValueSide = secondValueSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double thigh) {
        this.height = thigh;
    }

    @Override
    public double calculateArea() {
        return (firstValueSide + secondValueSide) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq.units, firstValueSide: "
                + getFirstValueSide() + " units, secondValueSide: "
                + getSecondValueSide() + " units, height: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
