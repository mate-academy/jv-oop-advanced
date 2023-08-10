package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_COUNT = 5;
    private ColorSuplier colorSuplier = new ColorSuplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: return createCircle();
            case 1: return createRectangle();
            case 2: return createSquare();
            case 3: return createTrapezoid();
            case 4: return createRightTriangle();
            default: return getDefaultFigure();
        }
    }

    private Figure createRectangle() {
        return new Rectangle(colorSuplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    private Figure createSquare() {
        return new Square(colorSuplier.getRandomColor(),
                random.nextDouble());
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSuplier.getRandomColor(), random.nextDouble(),
                random.nextDouble());
    }

    private Figure createCircle() {
        return new Circle(colorSuplier.getRandomColor(), random.nextDouble());
    }

    private Figure createTrapezoid() {
        return new IsoscelesTrapezoid(colorSuplier.getRandomColor(), random.nextDouble(),
                random.nextDouble(), random.nextDouble());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
