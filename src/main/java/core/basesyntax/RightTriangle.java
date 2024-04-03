package core.basesyntax;

public class RightTriangle extends Figure {

    private final String nameFigure = "RightTriangle";
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigure() + ", area: " + Math.round(area()
                * 10.0) / 10.0 + " sq. units, firstLeg: " + Math.round(getFirstLeg()
                * 10.0) / 10.0 + " units, second leg: " + Math.round(getSecondLeg()
                * 10.0) / 10.0 + " units, color: " + getColor() + ".");
    }
}
