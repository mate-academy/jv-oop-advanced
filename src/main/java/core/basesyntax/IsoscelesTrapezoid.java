package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "isosceles trapezoid";
    private double firstSide;
    private double secondSide;
    private double height;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        setFigureName(FIGURE_NAME);
        setArea(calculateArea());
        setColor(colorSupplier.getRandomColor());
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName() + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, first side: " + firstSide + " units, second side: "
                + secondSide + " units, height: " + height + " units");
    }
}
