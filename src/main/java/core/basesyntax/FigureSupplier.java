package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_PROP_LIMIT = 20;
    private Random randGen = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figurePos = randGen.nextInt(FiguresSet.values().length);
        FiguresSet figureElem = FiguresSet.values()[figurePos];
        String color = colorSupplier.getRandomColor();
        switch (figureElem) {
            case SQUARE:
                //to exclude situation side=0 and include upper limit we add 1
                int side = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                return new Square(color, side);
            case RECTANGLE:
                int sideA = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                int sideB = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                return new Rectangle(color, sideA, sideB);
            case RIGHT_TRIANGLE:
                int firstLeg = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                int secondLeg = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case CIRCLE:
                int radius = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                return new Circle(color, radius);
            default: //case ISOSCELES_TRAPEZOID:
                int baseA = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                int baseB = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                int height = randGen.nextInt(RANDOM_PROP_LIMIT) + 1;
                return new IsoscelesTrapezoid(color, baseA, baseB, height);
        }
    }

    private enum FiguresSet {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }
}
