package core.basesyntax;

public class Square extends Figure {
    private FigureSupplier side = new FigureSupplier();
    private double randSide = side.getSide();

    @Override
    public double calculateArea() {
        double squareArea = randSide * randSide;
        return squareArea;
    }

    @Override
    public String areaName() {
        String squareName = this.getClass().getSimpleName();
        return squareName;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + calculateArea() + " sq. units, side: "
                + randSide + " units, color: " + getColor();
    }

}
