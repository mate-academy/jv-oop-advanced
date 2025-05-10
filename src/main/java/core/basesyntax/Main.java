package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Figure[]figures = new Figure[randomNumber];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < randomNumber; i++) {
            figures[i] = supplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
