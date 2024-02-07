public class Main {
    public static void main(String[] args) {
        final int FN = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure []figures = new Figure[FN];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].drawFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].drawFigure();
            }

        }
    }
}
