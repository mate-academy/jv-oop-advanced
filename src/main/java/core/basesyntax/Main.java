package core.basesyntax;

import java.util.Random;

public class Main {
    public static  void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int countOfFigures = new Random().nextInt(10);
        Figure[] figures = new Figure[countOfFigures];

        int i = 0;
        while(i < countOfFigures) {
            figures[i] = figureSupplier.get();
            figures[i].draw();
            i++;
        }
    }
}
