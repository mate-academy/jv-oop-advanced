package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (int i = 0; i < 6; i++) {
            figures[i].draw();
        }

    }
}
