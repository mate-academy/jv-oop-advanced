package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
    }
}

