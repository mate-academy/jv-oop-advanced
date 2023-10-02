package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();
    private final int randomFigureType = random.nextInt(5);
    private final int randomSide = random.nextInt() * 16;

    public Figure getRandomFigure() {
        switch (randomFigureType) {
            case 0:
                return new Square(randomSide, randomColor.getRandomColor());
            case 1:
                return new Rectangle(randomSide, randomSide * 2, randomColor.getRandomColor());
            case 2:
                return new RightTriangle(randomSide, randomSide * 2, randomColor.getRandomColor());
            case 3:
                return new Circle(randomSide, randomColor.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(randomSide, randomSide,
                        randomSide / 1.1, randomColor.getRandomColor());
            default:
                return new Circle();
        }
    }

    public Circle getDefaultFigure() {
        return new Circle(10, Color.BLUE);
    }
}
