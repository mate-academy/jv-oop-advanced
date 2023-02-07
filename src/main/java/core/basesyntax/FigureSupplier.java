package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANDOM_INT_VALUE = 100;

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }

    private static Figure getRandomCircle() {
        int randomRadius = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Circle(randomColor, randomRadius);
    }

    private static Figure getRandomSquare() {
        int randomSide = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Square(randomColor, randomSide);
    }

    private static Figure getRandomRightTriangle() {
        int randomFirstLeg = getRandomInt();
        int randomSecondLeg = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private static Figure getRandomRectangle() {
        int randomFirstSide = getRandomInt();
        int randomSecondSide = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private static Figure getRandomIsoscelesTrapezoid() {
        int randomTop = getRandomInt();
        int randomBottom = getRandomInt();
        int randomHeight = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new IsoscelesTrapezoid(randomColor, randomTop, randomBottom, randomHeight);
    }

    private static int getRandomInt() {
        return random.nextInt(MAX_RANDOM_INT_VALUE) + 1; // making sure we don't return 0
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
