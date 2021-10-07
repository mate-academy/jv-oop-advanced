package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random randGen = new Random();
        int figurePos = randGen.nextInt(FiguresSet.values().length);
        FiguresSet figureElem = FiguresSet.values()[figurePos];
        Figure figureObj = null;
        switch (figureElem) {
            case SQUARE:
                figureObj = new Square();
                break;
            case RECTANGLE:
                figureObj = new Rectangle();
                break;
            case RIGHT_TRIANGLE:
                figureObj = new RightTriangle();
                break;
            case CIRCLE:
                figureObj = new Circle();
                break;
            case ISOSCELES_TRAPEZOID:
                figureObj = new IsoscelesTrapezoid();
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
