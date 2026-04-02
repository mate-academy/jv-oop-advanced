package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 100;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private int getRandomSide() {
        return random.nextInt((MAX) + 1);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureName.values().length);

        return switch (FigureName.values()[index]) {
            case CIRCLE -> new Circle(randomColor.getRandomColor(),
                    getRandomSide());
            case SQUARE -> new Square(randomColor.getRandomColor(),
                    getRandomSide());
            case RECTANGLE -> new Rectangle(randomColor.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
            case RIGHTTRIANGLE -> new RightTriangle(randomColor.getRandomColor(),
                    getRandomSide(),
                    getRandomSide());
            case ISOSCELESTRAPEZOID -> new IsoscelesTrapezoid(randomColor.getRandomColor(),
                    getRandomSide(),
                    getRandomSide(),
                    getRandomSide());
        };
    }
}
