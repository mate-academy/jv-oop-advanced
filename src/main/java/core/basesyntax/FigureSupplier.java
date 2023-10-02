package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();
    private final Circle defaultCircle = new Circle(10, Color.WHITE);

    public Figure getRandomFigure() {
        int randomFigureType = random.nextInt(5);
        int randomSide = random.nextInt() * 16;
        int randomMultiplier = random.nextInt(3) + 2;

        switch (randomFigureType) {
            case 0:
                return new Square(randomSide, randomColor.getRandomColor());
            case 1:
                return new Rectangle(randomSide,
                        randomSide * randomMultiplier, randomColor.getRandomColor());
            case 2:
                return new RightTriangle(randomSide,
                        randomSide * randomMultiplier, randomColor.getRandomColor());
            case 3:
                return new Circle(randomSide, randomColor.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(randomSide, randomSide,
                        randomSide / 1.1, randomColor.getRandomColor());
            default:
                return new Circle(randomSide, randomColor.getRandomColor());
        }
    }

    public Circle getDefaultFigure() {
        return defaultCircle;
    }
}
