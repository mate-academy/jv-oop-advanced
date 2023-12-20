package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    private final int BOUND_MAX = 20;
    private final int BOUND_MIN = 1;
    private final Random random = new Random();
    int indexFigureName;

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case Circle:
                double radius = random.nextInt(BOUND_MIN, BOUND_MAX);
                return new Circle(radius);
            case IsoscelesTrapezoid:
                double sideFirst = random.nextInt(BOUND_MIN, BOUND_MAX);
                double sideSecond = random.nextInt(BOUND_MIN, BOUND_MAX);
                double height = random.nextInt(BOUND_MIN, BOUND_MAX);
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case Rectangle:
                double sideBasis = random.nextInt(BOUND_MIN, BOUND_MAX);
                height = random.nextInt(BOUND_MIN, BOUND_MAX);
                return new Rectangle(sideBasis, height);
            case RightTriangle:
                double firstLeg = random.nextInt(BOUND_MIN, BOUND_MAX);
                double secondLeg = random.nextInt(BOUND_MIN, BOUND_MAX);
                return new RightTriangle(firstLeg, secondLeg);
            case Square:
                double side = random.nextInt(BOUND_MIN, BOUND_MAX);
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
