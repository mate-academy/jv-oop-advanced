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
        switch (figureNumber) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(), getFigureSide());
            case 1:
                return new Circle(new ColorSupplier().getRandomColor(), getFigureSide());
            case 2:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), getFigureSide(),
                        getFigureSide(), getFigureSide());
            case 3:
                return new Rectangle(new ColorSupplier().getRandomColor(), getFigureSide(),
                        getFigureSide());
            case 4:
                return new RightTriangle(new ColorSupplier().getRandomColor(), getFigureSide(),
                        getFigureSide());
            default:
                break;
        }
        return new Square(new ColorSupplier().getRandomColor(), getFigureSide());
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

