package core.basesyntax;

public class RightTriangle extends Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public String getName() {
        return "RightTriangle";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    double area() {
        return (this.firstLeg * this.secondLeg) / 2.0;
    }

    @Override
    public String drawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, " + "firstLeg: "
                + getFirstLeg() + " units, " + "secondLeg: " + getSecondLeg() + " units, "
                + "color: " + getColor());
    }
}
