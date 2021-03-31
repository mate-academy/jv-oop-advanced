package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends FigureGeneration {

    public static Figure getFigure() {
        int numberFigure = 5;
        Random random = new Random();
        int randomFigure = random.nextInt(numberFigure);
        Figure figure = null;
        switch (randomFigure) {
            case 0:
                figure = getCircle();
                break;
            case 1:
                figure = getSquare();
                break;
            case 2:
                figure = getTriangle();
                break;
            case 3:
                figure = getRectangle();
                break;
            default:
                figure = getTrapezoid();
                break;
        }
        return figure;
    }

}
