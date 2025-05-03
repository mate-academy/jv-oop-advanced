package core.basesyntax;

import core.basesyntax.Rectangle;
import core.basesyntax.RightTriangle;
import core.basesyntax.IsoscelesTrapezoid;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor().getColorName();
        int size = random.nextInt(MAX_SIZE) + 1;

        return switch (random.nextInt(5)) {
            case 0 -> new Square(size, color);
            case 1 -> new Circle(size, color);
            case 2 -> new Rectangle(size, random.nextInt(MAX_SIZE) + 1, color);
            case 3 -> new RightTriangle(size, random.nextInt(MAX_SIZE) + 1, color);
            case 4 -> new IsoscelesTrapezoid(size, random.nextInt(MAX_SIZE) + 1,
                    random.nextInt(MAX_SIZE) + 1, color);
            default -> getDefaultFigure();
        };
    }

    public Figure getRandomFigure() {
        FigureColor color = colorSupplier.getRandomColor();
        int size = random.nextInt(MAX_SIZE) + 1;
        int secondSize = random.nextInt(MAX_SIZE) + 1;
        int thirdSize = random.nextInt(MAX_SIZE) + 1;

        return switch (random.nextInt(5)) {
            case 0 -> new Square(size, color);
            case 1 -> new Circle(size, color);
            case 2 -> new Rectangle(size, secondSize, color);
            case 3 -> new RightTriangle(size, secondSize, color);
            case 4 -> new IsoscelesTrapezoid(size, secondSize, thirdSize, color);
            default -> getDefaultFigure();
        };
    }

}
