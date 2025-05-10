package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure randomFigure1 = figureSupplier.getRandomFigure();
        Figure randomFigure2 = figureSupplier.getRandomFigure();
        Figure randomFigure3 = figureSupplier.getRandomFigure();
        Figure defaultFigure1 = figureSupplier.getDefaultFigure();
        Figure defaultFigure2 = figureSupplier.getDefaultFigure();
        Figure defaultFigure3 = figureSupplier.getDefaultFigure();

        Figure[] figures = {
                randomFigure1,
                randomFigure2,
                randomFigure3,
                defaultFigure1,
                defaultFigure2,
                defaultFigure3};
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
