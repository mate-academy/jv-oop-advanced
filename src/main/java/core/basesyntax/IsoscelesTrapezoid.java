package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstSide;
    private double secondSide;

    public IsoscelesTrapezoid(String color, double height, double firstSide, double secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
    public double areaCalculator() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getName()
                + ", area: "
                + areaCalculator()
                + " sq.units, height: "
                + getHeight()
                + " units, firstSide: "
                + getFirstSide()
                + " units, secondSide: "
                + getSecondSide()
                + " units, color: " + getColor());
    }
}
