package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double FIGURE_VALUE_MIN = 2;
    public static final double FIGURE_VALUE_MAX = 40;
    private ColorSupplier color = new ColorSupplier();
    private Random random = new Random();

    private double getRandomValue() {
        return Math.ceil(FIGURE_VALUE_MIN + (FIGURE_VALUE_MAX - FIGURE_VALUE_MIN)
                * random.nextDouble());
    }

    private Figure getRandomCircle() {
        return new Circle(getRandomValue());
    }

    private Figure getRandomSquare() {
        return new Square(getRandomValue());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(getRandomValue(), getRandomValue());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandomValue(), getRandomValue());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue());
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("white");
        return circle;
    }

    public Figure getRandomFigure() {
        Figure result = null;
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                result = getRandomCircle();
                break;
            case 1:
                result = getRandomSquare();
                break;
            case 2:
                result = getRandomRectangle();
                break;
            case 3:
                result = getRandomRightTriangle();
                break;
            case 4:
                result = getRandomIsoscelesTrapezoid();
                break;
            default:
                getDefaultFigure();
                break;
        }
        result.setColor(color.getRandomColor());
        return result;
    }
}


