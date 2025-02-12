package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        int randomFigureNumber = random.nextInt(5);

        switch (randomFigureNumber) {
            case 0: {
                return new RightTriangle(randomColor, random.nextDouble(), random.nextDouble());
            }
            case 1: {
                return new Square(randomColor, random.nextDouble());
            }
            case 2: {
                return new Circle(randomColor, random.nextDouble());
            }
            case 3: {
                return new IsoscelesTrapezoid(randomColor, random.nextDouble(), random.nextDouble(),
                        random.nextDouble());
            }
            default:
                return new Rectangle(randomColor, random.nextDouble(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle(Color.WHITE.name(), 10);

        return whiteCircle;
    }
}
