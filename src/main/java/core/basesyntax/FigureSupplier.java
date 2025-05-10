package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = (int) (Math.random() * FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double radius = getRandomDouble();
                return new Circle(radius, color);
            case 1:
                double side = getRandomDouble();
                return new Square(side, color);
            case 2:
                double length = getRandomDouble();
                double width = getRandomDouble();
                return new Rectangle(length, width, color);
            case 3:
                double firstLeg = getRandomDouble();
                double secondLeg = getRandomDouble();
                return new RightTriangle(firstLeg, secondLeg, color);
            default:
                double topBase = getRandomDouble();
                double bottomBase = getRandomDouble();
                double height = getRandomDouble();
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomDouble() {
        return Math.random() * 10 + 1;
    }
}
