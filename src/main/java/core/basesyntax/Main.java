package core.basesyntax;

public class Main {
    public static final int NUMBER_ELEMENTS_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_ELEMENTS_ARRAY];

        for (int i = 0; i < NUMBER_ELEMENTS_ARRAY; i++) {
            if (i < NUMBER_ELEMENTS_ARRAY / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            System.out.println(figure);
        }
    }
}
