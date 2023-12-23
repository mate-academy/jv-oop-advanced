package core.basesyntax.figure;

import core.basesyntax.ColorSupplier;
import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private String color;

    private int randomParameters() {
        final int boundMax = 20;
        final int boundMin = 1;
        return random.nextInt(boundMin, boundMax);
    }

    public Figure getRandomFigure() {
        int indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case CIRCLE:
                double radius = randomParameters();
                color = colorSupplier.getRandomColor();
                return new Circle(radius, color);
            case ISOSCELEXTRAPEZOID:
                double sideFirst = randomParameters();
                double sideSecond = randomParameters();
                double height = randomParameters();
                color = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height, color);
            case RECTANGLE:
                double sideBasis = randomParameters();
                height = randomParameters();
                color = colorSupplier.getRandomColor();
                return new Rectangle(sideBasis, height, color);
            case RIGHTTRIANGLE:
                double firstLeg = randomParameters();
                double secondLeg = randomParameters();
                color = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, color);
            case SQUARE:
                double side = randomParameters();
                color = colorSupplier.getRandomColor();
                return new Square(side, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        final int defaultRadius = 10;
        color = colorSupplier.getDefaultColor();
        return new Circle(defaultRadius, color);
    }
}
