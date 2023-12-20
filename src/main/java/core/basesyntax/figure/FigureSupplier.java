package core.basesyntax.figure;

import java.util.Random;
import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureName;

public class FigureSupplier {
    private final int boundMax = 20;
    private final int boundMin = 1;
    private final Random random = new Random();
    private int indexFigureName;

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case Circle:
                double radius = random.nextInt(boundMin, boundMax);
                return new Circle(radius);
            case IsoscelesTrapezoid:
                double sideFirst = random.nextInt(boundMin, boundMax);
                double sideSecond = random.nextInt(boundMin, boundMax);
                double height = random.nextInt(boundMin, boundMax);
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case Rectangle:
                double sideBasis = random.nextInt(boundMin, boundMax);
                height = random.nextInt(boundMin, boundMax);
                return new Rectangle(sideBasis, height);
            case RightTriangle:
                double firstLeg = random.nextInt(boundMin, boundMax);
                double secondLeg = random.nextInt(boundMin, boundMax);
                return new RightTriangle(firstLeg, secondLeg);
            case Square:
                double side = random.nextInt(boundMin, boundMax);
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
