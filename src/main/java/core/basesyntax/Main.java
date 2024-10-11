package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figures randomFigure1 = figureSupplier.getRandomFigure();
        Figures randomFigure2 = figureSupplier.getRandomFigure();
        Figures randomFigure3 = figureSupplier.getRandomFigure();
        Figures defaultFigure1 = figureSupplier.getDefaultFigure();
        Figures defaultFigure2 = figureSupplier.getDefaultFigure();
        Figures defaultFigure3 = figureSupplier.getDefaultFigure();

        Figures[] figures = {
                randomFigure1,
                randomFigure2,
                randomFigure3,
                defaultFigure1,
                defaultFigure2,
                defaultFigure3};
        for (Figures figure : figures) {
            figure.draw();
        }
    }
}
