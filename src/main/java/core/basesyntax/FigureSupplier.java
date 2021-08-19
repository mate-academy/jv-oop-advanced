package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch ((int) (Math.random() * FIGURE_COUNT)) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    private Circle getCircle() {
        String figureColor = colorSupplier.getRandomColor();
        int radius = (int) (Math.random() * FIGURE_SIZE);
        return new Circle(figureColor, radius);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        String figureColor = colorSupplier.getRandomColor();
        int firstBase = (int) (Math.random() * FIGURE_SIZE);
        int secondBase = (int) (Math.random() * FIGURE_SIZE);
        int height = (int) (Math.random() * FIGURE_SIZE);
        return new IsoscelesTrapezoid(figureColor, firstBase, secondBase, height);
    }

    private Rectangle getRectangle() {
        String figureColor = colorSupplier.getRandomColor();
        int firstSide = (int) (Math.random() * FIGURE_SIZE);
        int secondSide = (int) (Math.random() * FIGURE_SIZE);
        return new Rectangle(figureColor, firstSide, secondSide);
    }

    private RightTriangle getRightTriangle() {
        String figureColor = colorSupplier.getRandomColor();
        int firstSide = (int) (Math.random() * FIGURE_SIZE);
        int secondSide = (int) (Math.random() * FIGURE_SIZE);
        return new RightTriangle(figureColor, firstSide, secondSide);
    }

    private Square getSquare() {
        String figureColor = colorSupplier.getRandomColor();
        int side = (int) (Math.random() * FIGURE_SIZE);
        return new Square(figureColor, side);
    }
}
