package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0: return isoscelesTrapezoidMaker();
            case 1: return circleMaker();
            case 2: return rightTriangleMaker();
            case 3: return rectangleMaker();
            default: return squareMaker();
        }
    }

    private IsoscelesTrapezoid isoscelesTrapezoidMaker() {
        return new IsoscelesTrapezoid(
                random.nextInt(100), random.nextInt(100), random.nextInt(100));
    }

    private Circle circleMaker() {
        return new Circle(random.nextInt(100));
    }

    private RightTriangle rightTriangleMaker() {
        return new RightTriangle(
                random.nextInt(100), random.nextInt(100));
    }

    private Rectangle rectangleMaker() {
        return new Rectangle(random.nextInt(100), random.nextInt(100));
    }

    private Square squareMaker() {
        return new Square(random.nextInt(100));
    }
}
