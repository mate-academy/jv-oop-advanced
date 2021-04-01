import core.basesyntax.Figure;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int NUMBER_LIMIT = 15;

    public static void main(String[] args) {
        Random number = new Random();
        List<Figure> figuresList = new ArrayList();

        for (int i = 0; i < number.nextInt(NUMBER_LIMIT) + 1; i++) {
            figuresList.add(FigureSupplier.getFigure());
        }

        for (Figure figure : figuresList) {
            figure.draw();
        }
    }
}
