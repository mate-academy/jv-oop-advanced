package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;
import java.util.Random;

public class FigureSupplier {
    private final int boundMax = 20;
    private final int boundMin = 1;
    private final int defaultRadius = 10;
    private final Random random = new Random();
    private int indexFigureName;

    public int RandomParameters() {
        return random.nextInt(boundMin, boundMax);
    }

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case CIRCLE:
                double radius = RandomParameters();
                return new Circle(radius);
            case ISOSCELEXTRAPEZOID:
                double sideFirst = RandomParameters();
                double sideSecond = RandomParameters();
                double height = RandomParameters();
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case RECTANGLE:
                double sideBasis = RandomParameters();
                height = RandomParameters();
                return new Rectangle(sideBasis, height);
            case RIGHTTRIANGLE:
                double firstLeg = RandomParameters();
                double secondLeg = RandomParameters();
                return new RightTriangle(firstLeg, secondLeg);
            case SQUARE:
                double side = RandomParameters();
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(defaultRadius);
        circle.setColor("WHITE");
        return circle;
    }
}
