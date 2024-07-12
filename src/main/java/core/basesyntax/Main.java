package core.basesyntax;

public class Main {

    public static void main(String[] Args) {
        final int ARRAY_LENGHT = 6;
        Figure figures[] = new Figure[6];

        for (int i = 0; i < ARRAY_LENGHT; i++) {
            if (i < ARRAY_LENGHT / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                figures[i].draw();
            }
        }

    }
}

