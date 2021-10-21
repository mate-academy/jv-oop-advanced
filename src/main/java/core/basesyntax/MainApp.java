package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = {figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(), figureSupplier.getDefaultFigure(),
                figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure()};
        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
