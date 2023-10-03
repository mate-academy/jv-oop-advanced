package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int baseLength = 10;
    private final int countOfFigures = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        int randomChoice = random.nextInt(countOfFigures);

        switch (randomChoice) {
            case 0:
                return new Square(random.nextDouble() * baseLength,
                        colorSupplier.getRandomColor().name());
            case 1:
                return new Rectangle(random.nextDouble() * baseLength,
                           random.nextDouble() * baseLength,
                                     colorSupplier.getRandomColor().name());
            case 2:
                return new RightTriangle(random.nextDouble() * baseLength,
                          random.nextDouble() * baseLength,
                                     colorSupplier.getRandomColor().name());
            case 3:
                return new Circle(random.nextDouble() * baseLength,
                                    colorSupplier.getRandomColor().name());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * baseLength,
                         random.nextDouble() * baseLength,
                        random.nextDouble() * baseLength, colorSupplier.getRandomColor().name());
            default:
                return null;
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(baseLength, Color.WHITE.name());
    }
}
