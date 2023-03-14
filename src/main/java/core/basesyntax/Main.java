package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
