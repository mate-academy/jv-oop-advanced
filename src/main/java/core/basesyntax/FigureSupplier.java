package core.basesyntax;

import java.util.Random;

public interface FigureSupplier extends ColorSupplier {
    default Figure getRandomFigure() {
        Random random = new Random();
        int randomFigureType = random.nextInt(5);
        int randomSide = random.nextInt() * 16;
        Color color = getRandomColor();

        switch (randomFigureType) {
            case 0:
                return new Square(randomSide, color);
            case 1:
                return new Rectangle(randomSide, randomSide * 2, color);
            case 2:
                return new RightTriangle(randomSide, randomSide * 2, color);
            case 3:
                return new Circle(randomSide, color);
            case 4:
                return new IsoscelesTrapezoid(randomSide, randomSide, randomSide / 1.1, color);
            default:
                return null;
        }
    }

    default Circle getDefaultFigure() {
        return new Circle(10, Color.BLUE);
    }
}
