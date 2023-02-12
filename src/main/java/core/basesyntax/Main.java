package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            Figure randomFigure = supplier.getRandomFigure();
            figures[i] = randomFigure;
            figures[i].drawFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            Figure defaultFigureFigure = supplier.getDefaultFigure();
            figures[i] = defaultFigureFigure;
            figures[i].drawFigure();
        }
    }
}
