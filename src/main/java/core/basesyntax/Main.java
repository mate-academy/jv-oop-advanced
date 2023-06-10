package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayOfFigure = new Figure[6];
        for (int i = 0; i < arrayOfFigure.length; i++) {
            arrayOfFigure[i] = i < arrayOfFigure.length / 2
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            arrayOfFigure[i].draw();
        }
    }
}

