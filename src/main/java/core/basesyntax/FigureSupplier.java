package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE = 100;
    private Random random = new Random();

    private int getFigureSide() {
        return random.nextInt(MAX_SIDE);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String figureColor = new ColorSupplier().getRandomColor();
        int sizeOfFigure = getFigureSide();
        switch (figureNumber) {
            case 0:
                return new Square(figureColor, sizeOfFigure);
            case 1:
                return new Circle(figureColor, sizeOfFigure);
            case 2:
                return new IsoscelesTrapezoid(figureColor, sizeOfFigure, sizeOfFigure,
                        sizeOfFigure);
            case 3:
                return new Rectangle(figureColor, sizeOfFigure, sizeOfFigure);
            case 4:
            default:
                return new RightTriangle(figureColor, sizeOfFigure, sizeOfFigure);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), 10);
    }
}

