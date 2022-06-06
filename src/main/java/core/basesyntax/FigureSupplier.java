package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_SIDE_LENGTH = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureNumber) {
            case 0:
                return circleMaker();
            case 1:
                return isoscelesTrapezoidMaker();
            case 2:
                return rectangleMaker();
            case 3:
                return rightTriangleMaker();
            default:
                return squareMaker();
        }
    }

    private Figure circleMaker() {
        int radius = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new Circle(radius);
    }

    private Figure isoscelesTrapezoidMaker() {
        int topSide = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int botSide = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int height = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new IsoscelesTrapezoid(topSide, botSide, height);
    }

    private Figure rectangleMaker() {
        int width = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int height = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new Rectangle(width, height);
    }

    private Figure rightTriangleMaker() {
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH) + 1;
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new RightTriangle(firstLeg, secondLeg);
    }

    private Figure squareMaker() {
        int side = random.nextInt(MAX_SIDE_LENGTH) + 1;
        return new Square(side);
    }
}
