package core.basesyntax;

public class Circle extends Figure {

    private FigureSupplier side = new FigureSupplier();

    private double randRadius = side.getSide();

    @Override
    public String areaName() {
        String circleName = this.getClass().getSimpleName();
        return circleName;
    }

    @Override
    public double calculateArea() {
        double circleArea = Math.PI * randRadius * randRadius;
        return circleArea;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + calculateArea() + " sq. units, radius: "
                + randRadius + " units, color: " + getColor();

    }

}
