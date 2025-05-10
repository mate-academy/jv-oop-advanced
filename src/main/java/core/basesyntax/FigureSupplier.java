package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURES_QUANTITY = 5;
    private static final int RANDOM_LIMIT = 50;
    private ColorSupplier color = new ColorSupplier();

    protected Figure[] generateFigures() {
        Figure[] figures = new Figure[(int) (Math.random() * RANDOM_LIMIT)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generateFigure();
        }
        return figures;
    }

    private Figure generateFigure() {
        Figure figure;
        int randomFigure = (int) (Math.random() * FIGURES_QUANTITY);
        switch (randomFigure) {
            case 0:
                figure = getNewCircle();
                break;
            case 1:
                figure = getNewIsoscelesTrapezoid();
                break;
            case 2:
                figure = getNewRectangle();
                break;
            case 3:
                figure = getNewRightTriangle();
                break;
            case 4:
                figure = getNewSquare();
                break;
            default:
                figure = getNewCircle();;
        }
        return figure;
    }

    private Circle getNewCircle() {
        return new Circle(color.colorGenerator(), Math.random() * RANDOM_LIMIT);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(color.colorGenerator(),
                Math.random() * RANDOM_LIMIT, Math.random() * RANDOM_LIMIT,
                Math.random() * RANDOM_LIMIT);
    }

    private Rectangle getNewRectangle() {
        return new Rectangle(color.colorGenerator(),
                Math.random() * RANDOM_LIMIT, Math.random() * RANDOM_LIMIT);
    }

    private RightTriangle getNewRightTriangle() {
        return new RightTriangle(color.colorGenerator(),
                Math.random() * RANDOM_LIMIT, Math.random() * RANDOM_LIMIT);
    }

    private Square getNewSquare() {
        return new Square(color.colorGenerator(), Math.random() * RANDOM_LIMIT);
    }

}
