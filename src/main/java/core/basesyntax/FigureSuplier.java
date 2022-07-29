package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int MAX_VALUE = 5;
    private static final int SIZE_LIMIT = 20;
    private final ColorSuplier color = new ColorSuplier();

    public Figure getRandomFigure() {
        switch (new Random().nextInt(MAX_VALUE)) {
            case 0:
                return new Circle(color.getRandomColor(),
                        new Random().nextInt(SIZE_LIMIT));
            case 1:
                return new Square(new Random().nextInt(SIZE_LIMIT),
                        color.getRandomColor());
            case 2:
                return new Rectangle(new Random().nextInt(SIZE_LIMIT),
                        new Random().nextInt(SIZE_LIMIT),
                        color.getRandomColor());
            case 3:
                return new RightTriangle(color.getRandomColor(),
                        new Random().nextInt(SIZE_LIMIT),
                        new Random().nextInt(SIZE_LIMIT));
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(),
                        new Random().nextInt(SIZE_LIMIT),
                        new Random().nextInt(SIZE_LIMIT),
                        new Random().nextInt(SIZE_LIMIT));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}

