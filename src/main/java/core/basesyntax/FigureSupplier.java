package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
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
        return new Circle(random.nextInt(100) + 1);
    }

    private Figure isoscelesTrapezoidMaker() {
        return new IsoscelesTrapezoid(random.nextInt(100) + 1,
                random.nextInt(100) + 1, random.nextInt(100) + 1);
    }

    private Figure rectangleMaker() {
        return new Rectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
    }

    private Figure rightTriangleMaker() {
        return new RightTriangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
    }

    private Figure squareMaker() {
        return new Square(random.nextInt(100) + 1);
    }
}
