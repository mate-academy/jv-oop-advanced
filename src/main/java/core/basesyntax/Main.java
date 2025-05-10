package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FigureSupplier.NUMBER_OF_FIGURES; i++) {
            if (i > FigureSupplier.NUMBER_OF_FIGURES / 2) {
                figureSupplier.getDefaultFigure().draw();
            } else {
                figureSupplier.getRandomFigure(i).draw();
            }
        }
    }
}
