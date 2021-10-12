package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random randGen = new Random();
        int figurePos = randGen.nextInt(FiguresSet.values().length);
        FiguresSet figureElem = FiguresSet.values()[figurePos];
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        Figure randomFigure = null;
        switch (figureElem) {
            case SQUARE:
                int side = randGen.nextInt(20) + 1;
                randomFigure = new Square(color, side);
                break;
            case RECTANGLE:
                int sideA = randGen.nextInt(20) + 1;
                int sideB = randGen.nextInt(20) + 1;
                randomFigure = new Rectangle(color, sideA, sideB);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = randGen.nextInt(20) + 1;
                int secondLeg = randGen.nextInt(20) + 1;
                randomFigure = new RightTriangle(color, firstLeg, secondLeg);
                break;
            case CIRCLE:
                int radius = randGen.nextInt(20) + 1;
                randomFigure = new Circle(color, radius);
                break;
            default: //case ISOSCELES_TRAPEZOID:
                int baseA = randGen.nextInt(20) + 1;
                int baseB = randGen.nextInt(20) + 1;
                int height = randGen.nextInt(20) + 1;
                randomFigure = new IsoscelesTrapezoid(color, baseA, baseB, height);
                break;
        }
        return randomFigure;
    }

    private enum FiguresSet {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }
}
