package core.basesyntax;

public class Rectangle extends FigureSupplier implements Area, AreaDrawing {
    private double randFirstSide = getSide();
    private double randSecondSide = getSide();

    @Override
    public double area() {
        double rectangleArea = randFirstSide * randSecondSide;
        return rectangleArea;
    }

    @Override
    public String areaName() {
        String rectangleName = "rectangle";
        return rectangleName;
    }

    public void rectangleToShow() {
        String part1 = "Figure: " + areaName() + ", area: " + area() + " sq. units, first side: ";
        String part2 = randFirstSide + " units, second side: ";
        String part3 = randSecondSide + " units, color: " + getColors();
        System.out.println(part1 + part2 + part3);
    }
}
