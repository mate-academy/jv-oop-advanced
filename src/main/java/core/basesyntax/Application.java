package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure1 = figureSupplier.getRandomFigure();
        Figure figure2 = figureSupplier.getRandomFigure();
        Figure figure3 = figureSupplier.getDefaultFigure();
        Figure[] figures = new Figure[] {figure1, figure2, figure3};
        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
