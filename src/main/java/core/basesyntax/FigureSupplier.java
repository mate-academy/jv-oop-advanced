package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_PARAMETER = 100;
    private Random randomValue = new Random();
    private ColorSupplier colorSupp = new ColorSupplier();

    public Figure getRundomFigure() {
        Figure figure = null;
        int index = randomValue.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                figure = getRandomCircle();
                break;
            case ISOSCELESTRAPEZOID:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case RECTANGLE:
                figure = getRandomRectangle();
                break;
            case RIGHTTRIANGLE:
                figure = getRandomRightTriangle();
                break;
            case SQUARE:
                figure = getRandomSquare();
                break;
            default:break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(MAX_PARAMETER));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupp.getRandomColor(),
                randomValue.nextInt(MAX_PARAMETER),
                randomValue.nextInt(MAX_PARAMETER),
                randomValue.nextInt(MAX_PARAMETER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(MAX_PARAMETER),
                randomValue.nextInt(MAX_PARAMETER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(MAX_PARAMETER),
                randomValue.nextInt(MAX_PARAMETER));
    }

    private Figure getRandomSquare() {
        return new Square(
                colorSupp.getRandomColor(),
                randomValue.nextInt(MAX_PARAMETER));
    }
}
