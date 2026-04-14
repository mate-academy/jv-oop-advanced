package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase()
                + ", area: " + calculateArea() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
