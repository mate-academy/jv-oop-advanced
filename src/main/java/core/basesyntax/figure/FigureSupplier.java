package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    private final int BoundMax = 20;
    private final int BoundMin = 1;
    private final Random random = new Random();
    private int indexFigureName;

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case Circle:
                double radius = random.nextInt(BoundMin, BoundMax);
                return new Circle(radius);
            case IsoscelesTrapezoid:
                double sideFirst = random.nextInt(BoundMin, BoundMax);
                double sideSecond = random.nextInt(BoundMin, BoundMax);
                double height = random.nextInt(BoundMin, BoundMax);
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case Rectangle:
                double sideBasis = random.nextInt(BoundMin, BoundMax);
                height = random.nextInt(BoundMin, BoundMax);
                return new Rectangle(sideBasis, height);
            case RightTriangle:
                double firstLeg = random.nextInt(BoundMin, BoundMax);
                double secondLeg = random.nextInt(BoundMin, BoundMax);
                return new RightTriangle(firstLeg, secondLeg);
            case Square:
                double side = random.nextInt(BoundMin, BoundMax);
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
