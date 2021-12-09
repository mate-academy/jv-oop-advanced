package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final double FIGURE_VALUE_MIN = 2;
    public static final double FIGURE_VALUE_MAX = 40;
    private final ColorSupplier color = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure = null;
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                figure = getRandomCircle();
                break;
            case 1:
                figure = getRandomSquare();
                break;
            case 2:
                figure = getRandomRectangle();
                break;
            case 3:
                figure = getRandomRightTriangle();
                break;
            case 4:
                figure = getRandomIsoscelesTrapezoid();
                break;
            default:
                return getDefaultFigure();
        }
        figure.setColor(color.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("white");
        return circle;
    }

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
}



