package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberRandomFigures = 6;
        Figure[] randomFigures = new Figure[numberRandomFigures];
        for (int i = 0; i < randomFigures.length; i++) {
            randomFigures[i] = (i < randomFigures.length / 2)
                               ? (figureSupplier.getRandomFigure())
                               : figureSupplier.getDefaultFigure();
            randomFigures[i].draw();
        }
    }
}
