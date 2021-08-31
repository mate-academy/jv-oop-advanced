package core.basesyntax;

public class Circle extends FigureSupplier implements Area, AreaDrawing {
    private double randRadius = getSide();

    @Override
    public String areaName() {
        String circleName = "circle";
        return circleName;
    }

    @Override
    public double area() {
        double circleArea = Math.PI * randRadius * randRadius;
        return circleArea;
    }

    public void circleToShow() {
        String part1 = "Figure: " + areaName() + ", area: " + area() + " sq. units, radius: ";
        String part2 = randRadius + " units, color: " + getColors();
        System.out.println(part1 + part2);
    }
}
