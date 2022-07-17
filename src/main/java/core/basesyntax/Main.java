package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier get_figure = new FigureSupplier();
        for (int i = 0; i < 6; i++) {
            figures [i] = (i < 3) ? get_figure.getRandomFigure() : get_figure.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
