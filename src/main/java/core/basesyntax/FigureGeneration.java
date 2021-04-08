package core.basesyntax;

import java.util.Random;

public class FigureGeneration extends FigureSupplier {
    public static final int FIGURE_NUMBER = 5;

    public Figure getFigure() {

        Random random = new Random();
        int randomFigure = random.nextInt(FIGURE_NUMBER);
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
