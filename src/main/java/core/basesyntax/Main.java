package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();

        }

    }
}


