package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] finalFigures = new Figure[10];

        for (int i = 0; i < finalFigures.length; i++) {
            if (i < finalFigures.length / 2) {
                finalFigures[i] = figureSupplier.getRandomFigure();
            } else {
                finalFigures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < finalFigures.length; i++) {
            finalFigures[i].draw();
        }
    }
}
