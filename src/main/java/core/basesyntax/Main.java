package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure(i);
            } else {
                figures[i] = figureSupplier.getDefaultFigure(i);
            }
        }
        for (Figure figure : figures) {
            figure.getDraw();
        }
    }
}
