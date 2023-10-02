package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.figureType = "square";
        this.side = side;
        this.area = side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + figureType + ", area: " + area
                + " sq.units, side: " + side + ", color: " + color);
    }
}
