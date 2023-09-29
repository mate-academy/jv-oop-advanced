package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomChoice = random.nextInt(5);


        switch (randomChoice) {
            case 0:
                return new Square(random.nextDouble() * 10, colorSupplier.getRandomColor().name());
            case 1:
                return new Rectangle(random.nextDouble() * 10, random.nextDouble() * 10, colorSupplier.getRandomColor().name());
            case 2:
                return new RightTriangle(random.nextDouble() * 10, random.nextDouble() * 10, colorSupplier.getRandomColor().name());
            case 3:
                return new Circle(random.nextDouble() * 10, colorSupplier.getRandomColor().name());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10, random.nextDouble() * 10,
                        random.nextDouble() * 10, colorSupplier.getRandomColor().name());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
