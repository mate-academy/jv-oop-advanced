package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        final int Number_Of_Figures = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[Number_Of_Figures];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }

}
