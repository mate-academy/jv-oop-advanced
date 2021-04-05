package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumOfFigures = random.nextInt(15) + 2;
        Figure[] figures = new Figure[randomNumOfFigures];
        for (int i = 0; i < randomNumOfFigures; i++) {
            figures[i] = new FigureSupplier().getFigure();
            System.out.println(figures[i].draw());
        }
    }
}
