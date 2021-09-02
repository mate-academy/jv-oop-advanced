package core.basesyntax;

public class Square extends Figure {
    private double randSide;

    public Square(double side, String color) {
        this.randSide = side;
        this.color = color;
    }

    @Override
    public double draw() {
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
        return "Figure: " + areaName() + ", area: " + draw() + " sq. units, side: "
                + randSide + " units, color: " + color;
    }

}
