package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE = 100;
    private Random randomFigure = new Random();
    private Random randomSide = new Random();

    public int getFigureSide() {
        return randomSide.nextInt(MAX_SIDE);
    }

    public Figure getRandomFigure() {
        int figureNumber = randomFigure.nextInt(FIGURE_COUNT);
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
                return new RightTriangle(figureColor, sizeOfFigure, sizeOfFigure);
            default:
                break;
        }
        return new Square(figureColor, sizeOfFigure); // is this correct to do like this
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }
}

