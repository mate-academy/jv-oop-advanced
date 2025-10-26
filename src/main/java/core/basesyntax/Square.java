package core.basesyntax;

public class Square extends Figure {
    private final String name = FigureName.SQUARE.name().toLowerCase();
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
