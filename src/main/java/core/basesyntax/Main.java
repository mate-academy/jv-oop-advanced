package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 5; i++) {
            figureSupplier.getRandomFigure().draw();
        }
    }
}

