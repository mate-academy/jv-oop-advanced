package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle() {

    }

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        double scale = Math.pow(10, 2);
        double area = firstSide * secondSide;
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + getArea() + " sq.units, first side: "
                + (int)firstSide + " units, second side: " + (int)secondSide + " units, color: "
                + getColor());
    }
}
