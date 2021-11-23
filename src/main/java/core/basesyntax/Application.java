package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figures[] figure = new Figures[3];
        for (int i = 0; i < 3; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].getDraw();
        }
    }
}
