package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    public static final String DEFAULT_COLOR = "White";
    public static final int DEFAULT_RADIUS = 10;
    private static ColorSuplier colorSuplier = new ColorSuplier();
    private static Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0: return createCircle();
            case 1: return createRectangle();
            case 2: return createSquare();
            case 3: return createTrapezoid();
            case 4: return createRightTriangle();
            default: return getDefaultFigure();
        }
    }

    public Figure createRectangle() {
        return new Rectangle(colorSuplier.getRandomColor(),random.nextInt(),random.nextInt());
    }

    public Figure createSquare() {
        return new Square(colorSuplier.getRandomColor(), random.nextInt());
    }

    public Figure createRightTriangle() {
        return new RightTriangle(colorSuplier.getRandomColor(),random.nextInt(),
                random.nextInt());
    }

    public Figure createCircle() {
        return new Circle(colorSuplier.getRandomColor(), random.nextInt());
    }

    public Figure createTrapezoid() {
        return new IsoscelesTrapezoid(colorSuplier.getRandomColor(),random.nextInt(),
                random.nextInt(), random.nextInt());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
