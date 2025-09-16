package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    // Змінено тип повернення на AbstractFigure
    public AbstractFigure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(color, random.nextInt(MAX_SIZE) + 1);
            case 1 -> new Rectangle(color,
                    random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1);
            case 2 -> new RightTriangle(color,
                    random.nextInt(MAX_SIZE) + 1, random.nextInt(MAX_SIZE) + 1);
            case 3 -> new Circle(color, random.nextInt(MAX_SIZE) + 1);
            case 4 -> new IsoscelesTrapezoid(color,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1);
            default -> getDefaultFigure();
        };
    }

    // і тут теж
    public AbstractFigure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

