package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int magicNumber = 10;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomChoice = random.nextInt(5);

        switch (randomChoice) {
            case 0:
                return new Square(random.nextDouble() * magicNumber,
                        colorSupplier.getRandomColor().name());
            case 1:
                return new Rectangle(random.nextDouble() * magicNumber,
                           random.nextDouble() * magicNumber,
                                     colorSupplier.getRandomColor().name());
            case 2:
                return new RightTriangle(random.nextDouble() * magicNumber,
                          random.nextDouble() * magicNumber,
                                     colorSupplier.getRandomColor().name());
            case 3:
                return new Circle(random.nextDouble() * magicNumber,
                                    colorSupplier.getRandomColor().name());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * magicNumber,
                         random.nextDouble() * magicNumber,
                        random.nextDouble() * magicNumber, colorSupplier.getRandomColor().name());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(magicNumber, Color.WHITE.name());
    }
}
