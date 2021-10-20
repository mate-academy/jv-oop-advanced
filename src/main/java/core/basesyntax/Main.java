package core.basesyntax;

import java.util.Random;
import randomizers.FigureSupplier;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        final int length = 6;

        for (int i = 0; i < length; i++) {
            if (i >= length / 2) {
                System.out.println(figureSupplier.getDefaultFigure());
                continue;
            }
            System.out.println(figureSupplier.getRandomFigure(random.nextInt(4)));
        }
    }
}
