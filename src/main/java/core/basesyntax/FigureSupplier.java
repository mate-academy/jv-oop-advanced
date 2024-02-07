package core.basesyntax;

public class FigureSupplier extends ColorSupplier {

    private static final int MAX_RANDOM_INT_NUM = 100;
    private static final int NUM_OF_EXTENDED_FIGURES = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;

    public Figure getRandomFigure() {
        int randomNum = getRandomInt(NUM_OF_EXTENDED_FIGURES);
        switch (randomNum) {
            case 1:
                return getCircle();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            case 5:
                return getSquare();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getCircle() {
        Color randomColor = getRandomColor();
        int randomRadius = getRandomInt(MAX_RANDOM_INT_NUM);

        return new Circle(randomColor, randomRadius);
    }

    private Figure getIsoscelesTrapezoid() {
        Color randomColor = getRandomColor();
        int randomSideA = getRandomInt(MAX_RANDOM_INT_NUM);
        int randomSideB = getRandomInt(MAX_RANDOM_INT_NUM);
        int randomSideH = getRandomInt(MAX_RANDOM_INT_NUM);

        return new IsoscelesTrapezoid(randomColor, randomSideA, randomSideB, randomSideH);
    }

    private Figure getRectangle() {
        Color randomColor = getRandomColor();
        int randomSideA = getRandomInt(MAX_RANDOM_INT_NUM);
        int randomSideB = getRandomInt(MAX_RANDOM_INT_NUM);

        return new Rectangle(randomColor, randomSideA, randomSideB);
    }

    private Figure getRightTriangle() {
        Color randomColor = getRandomColor();
        int randomFirstLeg = getRandomInt(MAX_RANDOM_INT_NUM);
        int randomSecondLeg = getRandomInt(MAX_RANDOM_INT_NUM);

        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Figure getSquare() {
        Color randomColor = getRandomColor();
        int randomSide = getRandomInt(MAX_RANDOM_INT_NUM);
        return new Square(randomColor, randomSide);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
