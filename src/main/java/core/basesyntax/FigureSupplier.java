package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int defaultCircleRadius = 10;
    private final Color defaultCircleColor = Color.WHITE;
    private Random randomValue = new Random();
    private ColorSupplier colorSupp = new ColorSupplier();

    public Figure getRundomFigure() {
        Figure figure = null;
        int index = randomValue.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                figure = new Circle(
                        colorSupp.getRandomColor(),
                        randomValue.nextInt(100));
                break;
            case ISOSCELESTRAPEZOID:
                figure = new IsoscelesTrapezoid(
                        colorSupp.getRandomColor(),
                        randomValue.nextInt(100),
                        randomValue.nextInt(100),
                        randomValue.nextInt(100));
                break;
            case RECTANGLE:
                figure = new Rectangle(
                        colorSupp.getRandomColor(),
                        randomValue.nextInt(100),
                        randomValue.nextInt(100));
                break;
            case RIGHTTRIANGLE:
                figure = new RightTriangle(
                        colorSupp.getRandomColor(),
                        randomValue.nextInt(100),
                        randomValue.nextInt(100));
                break;
            case SQUARE:
                figure = new Square(
                        colorSupp.getRandomColor(),
                        randomValue.nextInt(100));
                break;
            default:break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(defaultCircleColor, defaultCircleRadius);
        return figure;
    }
}
