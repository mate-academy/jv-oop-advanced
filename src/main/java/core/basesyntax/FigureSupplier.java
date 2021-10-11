package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random randGen = new Random();
        int figurePos = randGen.nextInt(FiguresSet.values().length);
        FiguresSet figureElem = FiguresSet.values()[figurePos];
        Figure figureObj = null;
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (figureElem) {
            case SQUARE:
                int side = randGen.nextInt(20) + 1;
                figureObj = new Square(color, side);
                break;
            case RECTANGLE:
                int sideA = randGen.nextInt(20) + 1;
                int sideB = randGen.nextInt(20) + 1;
                figureObj = new Rectangle(color, sideA, sideB);
                break;
            case RIGHT_TRIANGLE:
                int firstLeg = randGen.nextInt(20) + 1;
                int secondLeg = randGen.nextInt(20) + 1;
                figureObj = new RightTriangle(color, firstLeg, secondLeg);
                break;
            case CIRCLE:
                int radius = randGen.nextInt(20) + 1;
                figureObj = new Circle(color, radius);
                break;
            case ISOSCELES_TRAPEZOID:
                int baseA = randGen.nextInt(20) + 1;
                int baseB = randGen.nextInt(20) + 1;
                int height = randGen.nextInt(20) + 1;
                figureObj = new IsoscelesTrapezoid(color, baseA, baseB, height);
                break;
/*
            default:
                System.out.println("There is no figure type" + figureElem + " in enum FiguresSet");
                return;//error
*/
        }
        if (figureObj == null) {
            //It will never reach here, just to make compiler happy
            throw new IllegalArgumentException("There is no figure type" + figureElem + " in enum FiguresSet");
        } else {
            return figureObj;
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
