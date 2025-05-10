package figure;

import java.util.Random;

public class FigureMain {
    public static final int FIGURES_COUNT_TO_CREATE = 50;

    public static void main(String[] args) {
        int countToCreate = new Random().nextInt(FIGURES_COUNT_TO_CREATE) + 1;
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        Figure[] figures = new Figure[countToCreate];
        for (int i = 0; i < countToCreate; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure element : figures) {
            element.draw();
        }
    }
}
