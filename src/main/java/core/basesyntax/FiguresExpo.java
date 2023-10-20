package core.basesyntax;

public class FiguresExpo {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(3);
        Figure[] figures = figureSupplier.getFiguresArray();

        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
