package core.basesyntax;

public class Square extends Figure {
    private final String nameFigure = "Square";
    private double leg;

    public Square(String color, double leg) {
        super(color);
        this.leg = leg;
    }

    public String getNameFigure() {
        return nameFigure;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double area() {
        return Math.pow(getLeg(), 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getNameFigure() + ", area: " + Math.round(area()
                * 10.0) / 10.0 + " sq. units, leg: " + Math.round(getLeg()
                * 10.0) / 10.0 + " units, color: " + getColor() + ".");
    }
}
