package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_SIZE = 100;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String figureColor = new ColorSupplier().getRandomColor();
        switch ((int) (Math.random() * FIGURE_COUNT)) {
            case 0:
                return new Circle(figureColor, (int) (Math.random() * FIGURE_SIZE));
            case 1:
                return new IsoscelesTrapezoid(figureColor, (int) (Math.random() * FIGURE_SIZE),
                        (int) (Math.random() * FIGURE_SIZE), (int) (Math.random() * FIGURE_SIZE));
            case 2:
                return new Rectangle(figureColor, (int) (Math.random() * FIGURE_SIZE),
                        (int) (Math.random() * FIGURE_SIZE));
            case 3:
                return new RightTriangle(figureColor, (int) (Math.random() * FIGURE_SIZE),
                        (int) (Math.random() * FIGURE_SIZE));
            default:
                return new Square(figureColor, (int) (Math.random() * FIGURE_SIZE));
        }
    }
}
