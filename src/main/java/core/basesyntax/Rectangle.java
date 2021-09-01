package core.basesyntax;

public class Rectangle extends Figure {

    private FigureSupplier side = new FigureSupplier();
    private double randFirstSide = side.getSide();
    private double randSecondSide = side.getSide();

    @Override
    public double calculateArea() {
        double rectangleArea = randFirstSide * randSecondSide;
        return rectangleArea;
    }

    @Override
    public String areaName() {
        String rectangleName = this.getClass().getSimpleName();
        return rectangleName;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + calculateArea() + " sq. units, first side: "
                + randFirstSide + " units, second side: "
                + randSecondSide + " units, color: " + getColor();

    }

}
