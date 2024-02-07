package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure [] figures = new Figure [6];
        for (int i = 0; i < 3; i++) {
            figures[i] = figure.getDefaultFigure();
        }
        for (int i = 3; i < 6; i++) {
            figures[i] = figure.getRandomFigure();
        }
        for (Figure figure1 : figures) {
            figure1.draw();
        }
    }
}
