package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                Figure randomFigure = figureSupplier.getRandomFigure();
                figures[i] = randomFigure;
            } else {
                Figure defaultFigure = figureSupplier.getDefaultFigure();
                figures[i] = defaultFigure;
            }
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
