package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresArraySize = 6;

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[figuresArraySize];

        for (int i = 0; i < figures.length; i++) {
            if (i < figuresArraySize / 2) {
                figures[i] = figureSupplier.getRandomFigure().draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
