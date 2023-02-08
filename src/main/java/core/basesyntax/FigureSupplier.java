package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAUlT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANDOM_INT_VALUE = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

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

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAUlT_RADIUS);
    }

    private Figure getRandomCircle() {
        int randomRadius = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Circle(randomColor, randomRadius);
    }

    private Figure getRandomSquare() {
        int randomSide = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Square(randomColor, randomSide);
    }

    private Figure getRandomRightTriangle() {
        int randomFirstLeg = getRandomInt();
        int randomSecondLeg = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Figure getRandomRectangle() {
        int randomFirstSide = getRandomInt();
        int randomSecondSide = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int randomTop = getRandomInt();
        int randomBottom = getRandomInt();
        int randomHeight = getRandomInt();
        Color randomColor = colorSupplier.getRandomColor();

        return new IsoscelesTrapezoid(randomColor, randomTop, randomBottom, randomHeight);
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_INT_VALUE) + 1; // making sure we don't return 0
    }
}
