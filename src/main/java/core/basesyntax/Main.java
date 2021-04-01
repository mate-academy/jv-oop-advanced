package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int RANDOM_MAX_LIST_LENGTH = 20;

    public static void main(String[] args) {
        Random number = new Random();
        List<Figure> figuresList = new ArrayList();

        for (int i = 0; i < number.nextInt(RANDOM_MAX_LIST_LENGTH) + 1; i++) {
            figuresList.add(FigureSupplier.generateRandomFigure());
        }

        for (Figure figure : figuresList) {
            figure.draw();
        }
    }
}
