package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int count = 3;
        int i = 0;
        while (i < count) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            randomFigure.draw();
            i++;
        }

        i = 0;
        while (i < count) {
            Figure defaultFigure = figureSupplier.getDefaultFigure();
            defaultFigure.draw();
            i++;
        }
    }
}
