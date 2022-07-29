package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int FIGURE_LENGTH_MAX = 7;
    private static final Color circleColor = Color.WHITE;
    private static final double circleRadius = 10.00;
    private static final Figure circle = new Circle(circleColor,circleRadius);
    int random = new Random().nextInt(FIGURE_COUNT);

  //  public Figure getRandomFigure() {

    //    return ;


    public Figure getDefaultFigure() {
        return circle;
    }
}


