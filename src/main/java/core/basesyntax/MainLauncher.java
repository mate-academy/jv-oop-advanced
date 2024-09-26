package core.basesyntax;

public class MainLauncher {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = figureSupplier.getRandomFigure();

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
