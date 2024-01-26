package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE_NAME = "square";
    private double side;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Square(double side) {
        this.side = side;
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, side: " + side + " units");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
