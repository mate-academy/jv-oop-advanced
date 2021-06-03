package figure;

import java.util.Random;

public class FigureMain {
    public static final int FIGURES_COUNT_TO_CREATE = 50;

    public static void main(String[] args) {
        int countToCreate = new Random().nextInt(FIGURES_COUNT_TO_CREATE) + 1;
        Figure[] figures = new Figure[countToCreate];
        for (int i = 0; i < countToCreate; i++) {
            figures[i] = new FigureSupplier(new ColorSupplier()).getRandomFigure();
        }
        for (Figure element : figures) {
            element.draw();
        }
    }
}
