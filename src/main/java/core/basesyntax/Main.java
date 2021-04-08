package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[(int) (Math.random() + 1)];
        for (Figure figure: figures) {
            figureSupplier.getRandomFigure().draw();
        }
    }
}
