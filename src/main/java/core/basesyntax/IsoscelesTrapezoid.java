package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String nameFigure = "IsoscelesTrapezoid";
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return ((getFirstLeg() + getSecondLeg()) * getHeight()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigure() + ", area: " + Math.round(area()
                * 10.0) / 10.0 + " sq. units, firstLeg: " + Math.round(getFirstLeg()
                * 10.0) / 10.0 + " units, second leg: " + Math.round(getSecondLeg()
                * 10.0) / 10.0 + " units, height: " + Math.round(getHeight()
                * 10.0) / 10.0 + " units, color: " + getColor() + ".");
    }
}
