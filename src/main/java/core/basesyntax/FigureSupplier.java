package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURES_COUNT);

        switch (figureIndex) {
            case 0:
                double randomRadius = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                return new Circle(randomRadius);
            case 1:
                double randomSize = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                return new Square(randomSize);
            case 2:
                double sideA = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                double sideB = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                return new Rectangle(sideA, sideB);
            case 3:
                double firstLeg = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                double secondLeg = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                return new RightTriangle(firstLeg, secondLeg);
            case 4:
                double rightSide = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                double leftSide = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                double height = random.nextInt(Figure.MAX_SIZE_VARIABLE);
                return new IsoscelesTrapezoid(rightSide, leftSide, height);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle();
    }
}
