package core.basesyntax;

public class HelloWorld {

    public static void main(String[] args) {

        final FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];
        figures[0] = figureSupplier.getRandomFigure();
        figures[1] = figureSupplier.getRandomFigure();
        figures[2] = figureSupplier.getRandomFigure();
        figures[3] = figureSupplier.getRandomFigure();
        figures[4] = figureSupplier.getRandomFigure();
        figures[5] = figureSupplier.getRandomFigure();

        for (int i = figures.length / 2; i < figures.length; i++) {
            if (figures[i] != null) {
                figures[i].printInfo();
            }
        }

        figures[3] = figureSupplier.getRandomFigure();
        figures[3].printInfo();
        figures[4] = figureSupplier.getRandomFigure();
        figures[4].printInfo();
        figures[5] = figureSupplier.getRandomFigure();
        figures[5].printInfo();
    }
}


