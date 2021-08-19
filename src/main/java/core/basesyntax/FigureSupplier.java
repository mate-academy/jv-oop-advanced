package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String figureColor = new ColorSupplier().getRandomColor();
        int size = (int) (Math.random() * FIGURE_SIZE);
        switch ((int) (Math.random() * FIGURE_COUNT)) {
            case 0:
                return new Circle(figureColor, size);
            case 1:
                return new IsoscelesTrapezoid(figureColor, size, size, size);
            case 2:
                return new Rectangle(figureColor, size, size);
            case 3:
                return new RightTriangle(figureColor, size, size);
            default:
                return new Square(figureColor, size);
        }
    }
}
