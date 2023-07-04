package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresNumber = 6;
        Figure[] figures = new Figure[figuresNumber];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
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
