package figure;

import java.util.Random;

public class FigureMain extends FigureSupplier {
    public static final int FIGURES_COUNT_TO_CREATE = 50;

    public static void main(String[] args) {
        Figure[] figures =
                createRandomArrayOfFigures(new Random().nextInt(FIGURES_COUNT_TO_CREATE) + 1);
        for (Figure element : figures) {
            element.draw();
        }
    }
}
