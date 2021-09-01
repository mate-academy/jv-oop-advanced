package core.basesyntax;

public class Triangle extends Figure {
    private FigureSupplier side = new FigureSupplier();

    private double firstLeg = side.getSide();
    private double secondLeg = side.getSide();

    @Override
    public double calculateArea() {
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
        return "Figure: " + areaName() + ", area: " + calculateArea() + " sq. units, first Leg: "
                + firstLeg + " units, second Leg: " + secondLeg
                + " units, color: " + getColor();

    }
}
