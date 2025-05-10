package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_INDEX = 5;

    private Circle getRandomCircle() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomRadius = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        return new Circle(randomColor, randomRadius);
    }

    private Rectangle getRandomRectangle() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomLength = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        double randomWidth = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        return new Rectangle(randomColor, randomLength, randomWidth);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomBase1 = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        double randomBase2 = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        double randomHeight = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        return new IsoscelesTrapezoid(randomColor, randomBase1, randomBase2, randomHeight);
    }

    private RightTriangle getRandomRightTriangle() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomFirstLeg = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        double randomSecondLeg = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Square getRandomSquare() {
        String randomColor = new ColorSupplier().getRandomColor();
        double randomSide = new Random().nextInt((MAX_RANDOM_NUMBER) + 1);
        return new Square(randomColor, randomSide);
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(MAX_RANDOM_INDEX);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }
}
