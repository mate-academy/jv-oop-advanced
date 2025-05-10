package core.basesyntax;

public class Triangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Triangle(double side, String color) {
        this.firstLeg = side;
        this.secondLeg = side;
        this.color = color;
    }

    @Override
    public double draw() {
        double triangleArea = (firstLeg * secondLeg) / 2;
        return triangleArea;
    }

    @Override
    public String areaName() {
        String triangleName = this.getClass().getSimpleName();
        return triangleName;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + draw() + " sq. units, first Leg: "
                + firstLeg + " units, second Leg: " + secondLeg
                + " units, color: " + color;

    }
}
