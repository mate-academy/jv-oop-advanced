package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIDE_SIZE_LIMIT = 100;
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int paramsRandomizer1 = random.nextInt(SIDE_SIZE_LIMIT);
    private final int paramsRandomizer2 = random.nextInt(SIDE_SIZE_LIMIT);
    private final String randomColor = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        FigureSupplier figureSupplier = new FigureSupplier();
        switch (random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            case 0:
                return figureSupplier.getRandomCircle();
            case 1:
                return figureSupplier.getRandomRectangle();
            case 2:
                return figureSupplier.getRandomIscTrap();
            case 3:
                return figureSupplier.getRandomSquare();
            case 4:
                return figureSupplier.getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle("white", 10);
    }

    public Circle getRandomCircle() {
        return new Circle(randomColor, paramsRandomizer1);
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(randomColor, paramsRandomizer1, paramsRandomizer2);
    }

    public Square getRandomSquare() {
        return new Square(randomColor, paramsRandomizer1);
    }

    public IsoscelesTrapezoid getRandomIscTrap() {
        return new IsoscelesTrapezoid(randomColor, paramsRandomizer1,
                paramsRandomizer2, random.nextInt(SIDE_SIZE_LIMIT));
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(randomColor, paramsRandomizer1);
    }

}
