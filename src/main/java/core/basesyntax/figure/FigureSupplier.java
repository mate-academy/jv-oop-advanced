package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.ColorSupplier;
import core.basesyntax.enums.FigureName;

import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    String color;

    private int randomParameters() {
        final int BOUNDMAX = 20;
        final int BOUNDMIN = 1;
        return random.nextInt(BOUNDMIN, BOUNDMAX);
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
        final int DEFAULTRADIUS = 10;
        final String DEFAULTCOLOR = "WHITE";
        return new Circle(DEFAULTRADIUS, DEFAULTCOLOR);
    }
}
