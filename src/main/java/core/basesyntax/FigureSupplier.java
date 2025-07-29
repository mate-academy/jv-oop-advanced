package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNum = random.nextInt(5);
        return switch (randomNum) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomSquare();
            case 2 -> createRandomTriangle();
            case 3 -> createRandomRectangle();
            default -> createRandomTrapezoid();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private Circle createRandomCircle() {
        return new Circle(color.getRandomColor(), random.nextInt(1,10));
    }

    private Square createRandomSquare() {
        return new Square(color.getRandomColor(), random.nextInt(1,10));
    }

    private RightTriangle createRandomTriangle() {
        return new RightTriangle(
                color.getRandomColor(),
                random.nextInt(1,10),
                random.nextInt(1,10)
        );
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(color.getRandomColor(), random.nextInt(1,10), random.nextInt(1,10));
    }

    private IsoscelesTrapezoid createRandomTrapezoid() {
        return new IsoscelesTrapezoid(
                color.getRandomColor(),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10)
        );
    }
}
