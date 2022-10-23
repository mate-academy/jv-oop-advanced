package core.basesyntax;

public class Main {
    private static final int SIZE = 6;

    public static void main(String[] args){
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE];
        for (int i = 0 ; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
