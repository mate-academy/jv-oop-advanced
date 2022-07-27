package core.basesyntax.models;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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
    public double area() {
        return (double) getFirstLeg() * getSecondLeg() / 2;
    }

    @Override
    public String printInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Figure: right triangle, first leg - ")
                .append(getFirstLeg())
                .append(" units, second leg - ")
                .append(getSecondLeg())
                .append(" units, color - ")
                .append(getColor())
                .append(", area - ")
                .append(area())
                .append(" sq.units");
        return info.toString();
    }
}
