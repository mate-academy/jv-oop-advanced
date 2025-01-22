package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_SIZE = 10;
    private static final int NUMBER_OF_FIGURE = ListOfFigures.values().length;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final Figure DEFAULT_FIGURES = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    private static final Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURES;
    }

    private int getRandomNumber(int bound) {
        return random.nextInt(1, bound);
    }

    public Figure getRandomFigure() {
        int indexListOfFigure = random.nextInt(NUMBER_OF_FIGURE);
        String randomColor = colorSupplier.getRandomColor();
        switch (indexListOfFigure) {
            case 0:
                int randomRadius = getRandomNumber(FIGURE_SIZE / 2);
                return new Circle(randomColor, randomRadius);
            case 1:
                int randomSide = getRandomNumber(FIGURE_SIZE);
                return new Square(randomColor, randomSide);
            case 2:
                int rectangleRandomFirstLeg = getRandomNumber(FIGURE_SIZE);
                int rectangleRandomSecondLeg = getRandomNumber(FIGURE_SIZE);
                return new Rectangle(randomColor, rectangleRandomFirstLeg,
                        rectangleRandomSecondLeg);
            case 3:
                int rightTriangleRandomFirstLeg = getRandomNumber(FIGURE_SIZE);
                int rightTriangleRandomSecondLeg = getRandomNumber(FIGURE_SIZE);
                return new RightTriangle(randomColor,rightTriangleRandomFirstLeg,
                        rightTriangleRandomSecondLeg);
            default:
                int isoscelesTrapezoidRandomFirstLeg = getRandomNumber(FIGURE_SIZE);
                int isoscelesTrapezoidRandomSecondLeg = getRandomNumber(FIGURE_SIZE);
                int randomHeight = getRandomNumber(FIGURE_SIZE);
                return new IsoscelesTrapezoid(randomColor, isoscelesTrapezoidRandomFirstLeg,
                        isoscelesTrapezoidRandomSecondLeg, randomHeight);
        }
    }
}
