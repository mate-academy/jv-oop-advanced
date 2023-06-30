package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int amountOfFigures = 6;
        Figure[] figures = new Figure[amountOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < amountOfFigures; i++) {
            if (i < amountOfFigures / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
