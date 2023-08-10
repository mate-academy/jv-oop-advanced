package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSuplier figureSuplier = new FigureSuplier();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (ARRAY_SIZE / 2 > i) {
                figures[i] = figureSuplier.getRandomFigure();
            } else {
                figures[i] = figures[i - ARRAY_SIZE / 2];
            }
            figures[i].draw();
        }
    }
}

