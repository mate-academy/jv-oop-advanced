package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int ARRAY_LENGTH = 10;
    private static Random random = new Random();

    public static void main(String[] args) {

        int arrayI = random.nextInt(ARRAY_LENGTH) + 1;
        Figure[] arrayOfFigures = new Figure[arrayI];
        for (int i = 0; i < arrayI; i++) {
            arrayOfFigures[i] = new FigureSupplier().getRandomFigure();
            arrayOfFigures[i].draw();
        }
    }
}
