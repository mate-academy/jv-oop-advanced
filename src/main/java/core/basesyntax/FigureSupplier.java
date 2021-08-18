package core.basesyntax;

public class FigureSupplier extends CollorSupplier {
    public Figure getRandomFigure() {
        switch ((int) (Math.random() * 5)) {
            case 1:
                return new RightTriangle(Figure.FIGURE_COUNT, Figure.FIGURE_COUNT);
            case 2:
                return new Circle(Figure.FIGURE_COUNT);
            case 3:
                return new Square(Figure.FIGURE_COUNT);
            case 4:
                return new IsoscelesTrapezoid(Figure.FIGURE_COUNT,
                        Figure.FIGURE_COUNT, Figure.FIGURE_COUNT);
            default:
                return new Rectangle(Figure.FIGURE_COUNT, Figure.FIGURE_COUNT);
        }
    }
}
