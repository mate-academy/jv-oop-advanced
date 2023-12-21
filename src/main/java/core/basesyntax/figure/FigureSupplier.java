package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureName;
import java.util.Random;

public class FigureSupplier {
    private final int boundMax = 20;
    private final int boundMin = 1;
    private final int defaultRadius = 10;
    private final Random random = new Random();
    private int indexFigureName;

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case CIRCLE:
                double radius = random.nextInt(boundMin, boundMax);
                return new Circle(radius);
            case ISOSCELEXTRAPEZOID:
                double sideFirst = random.nextInt(boundMin, boundMax);
                double sideSecond = random.nextInt(boundMin, boundMax);
                double height = random.nextInt(boundMin, boundMax);
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case RECTANGLE:
                double sideBasis = random.nextInt(boundMin, boundMax);
                height = random.nextInt(boundMin, boundMax);
                return new Rectangle(sideBasis, height);
            case RIGHTTRIANGLE:
                double firstLeg = random.nextInt(boundMin, boundMax);
                double secondLeg = random.nextInt(boundMin, boundMax);
                return new RightTriangle(firstLeg, secondLeg);
            case SQUARE:
                double side = random.nextInt(boundMin, boundMax);
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, Color.WHITE);
    }
}
