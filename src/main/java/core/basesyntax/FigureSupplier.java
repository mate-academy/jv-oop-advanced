package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int NUMBER_OF_FIGURES = 5;
    static final int NUMBER_OF_PARAM = 100;
    static final int DEFAULT_CIRCLE_RADIUS = 10;
    static final int ADDITION_RANDOM = 1;
    static final int ADDITION_RANDOM_BIG = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final String whiteColorLowerCase = Color.WHITE.name().toLowerCase();

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);
        int randomFigureParam = random.nextInt(NUMBER_OF_PARAM) + ADDITION_RANDOM;
        int randomFigureParamB = random.nextInt(NUMBER_OF_PARAM) + ADDITION_RANDOM_BIG;

        switch (randomFigureIndex) {
            case 0:
                Figure randomFigureCircle = new Circle(colorSupplier.getRandomColor(),
                        randomFigureParam);
                return randomFigureCircle;
            case 1:
                Figure randomFigureSquare = new Square(colorSupplier.getRandomColor(),
                        randomFigureParam);
                return randomFigureSquare;
            case 2:
                Figure randomFigureRectangle = new Rectangle(colorSupplier.getRandomColor(),
                        randomFigureParamB, randomFigureParam);
                return randomFigureRectangle;
            case 3:
                Figure randomFigureRightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        randomFigureParamB, randomFigureParam);
                return randomFigureRightTriangle;
            default:
                Figure randomFigureIsoscelesTrapezoid = new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        randomFigureParam, randomFigureParamB, randomFigureParam);
                return randomFigureIsoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(whiteColorLowerCase, DEFAULT_CIRCLE_RADIUS);
        return defaultFigure;
    }
}
