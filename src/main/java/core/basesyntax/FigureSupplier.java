package core.basesyntax;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = new java.util.Random().nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.getProperty());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.getProperty(), random.getProperty());
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.getProperty());
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.getProperty(), random.getProperty());
            case 5:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.getProperty(), random.getProperty(), random.getProperty());
            default:
                return new Circle(Color.WHITE.name(), 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
