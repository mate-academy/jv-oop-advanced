package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int DEFAULT_SIDE_LENGTH = 10;
    static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public AbstractFigure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor().name();

        int randomChoice = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomChoice) {
            case 0:
                return new Square(random.nextDouble() * DEFAULT_SIDE_LENGTH, randomColor);
            case 1:
                return new Rectangle(random.nextDouble() * DEFAULT_SIDE_LENGTH,
                        random.nextDouble() * DEFAULT_SIDE_LENGTH, randomColor);
            case 2:
                return new RightTriangle(random.nextDouble() * DEFAULT_SIDE_LENGTH,
                        random.nextDouble() * DEFAULT_SIDE_LENGTH, randomColor);
            case 3:
                return new Circle(random.nextDouble() * DEFAULT_SIDE_LENGTH, randomColor);
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * DEFAULT_SIDE_LENGTH,
                        random.nextDouble() * DEFAULT_SIDE_LENGTH,
                        random.nextDouble() * DEFAULT_SIDE_LENGTH, randomColor);
            default:
                return null;
        }
    }

    public AbstractFigure getDefaultFigure() {
        return new Circle(DEFAULT_SIDE_LENGTH, Color.WHITE.name());
    }
}
