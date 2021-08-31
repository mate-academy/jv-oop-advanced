package core.basesyntax;

public class Square extends FigureSupplier implements Area, AreaDrawing {
    private double randSide = getSide();

    @Override
    public double area() {
        double squareArea = randSide * randSide;
        return squareArea;
    }

    @Override
    public String areaName() {
        String squareName = "square";
        return squareName;
    }

    public void squareToShow() {
        String part1 = "Figure: " + areaName() + ", area: " + area() + " sq. units, side: ";
        String part2 = randSide + " units, color: " + getColors();
        System.out.println(part1 + part2);
    }
}
