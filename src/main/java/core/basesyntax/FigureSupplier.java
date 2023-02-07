package core.basesyntax;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_BOUND = 5;
    private static final int MAX_BOUND = 20;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        switch (colorSupplier.getRandom().nextInt(FIGURES_BOUND)) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomTrapezoid();
            default:
                return getRandomTriangle();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }

    private IsoscelesTrapezoid getRandomTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND),
                colorSupplier.getRandom().nextInt(MAX_BOUND),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                colorSupplier.getRandom().nextInt(MAX_BOUND),
                colorSupplier.getRandom().nextInt(MAX_BOUND));
    }
}
