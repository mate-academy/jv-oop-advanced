package core.basesyntax;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "rectangle";
    private double firstSide;
    private double secondSide;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, first side: " + firstSide
                + " units, second side: " + secondSide + " units");
    }
}
