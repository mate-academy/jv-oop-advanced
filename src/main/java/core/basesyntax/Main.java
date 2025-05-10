package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figure = new FigureSupplier();
        Figure firstFigure = figure.getRandomFigure();
        Figure secondFigure = figure.getRandomFigure();
        Figure thirdFigure = figure.getDefaultFigure();
        Figure[] arraysFigure = {firstFigure, secondFigure, thirdFigure};
        for (int i = 0; i < arraysFigure.length; i++) {
            arraysFigure[i].draw();
        }
    }
}
