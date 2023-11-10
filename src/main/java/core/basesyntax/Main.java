package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int amountOfFigures = 6;
        Figure[] figures = new Figure[amountOfFigures];

        for (int i = 0; i < amountOfFigures / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = amountOfFigures / 2; i < amountOfFigures; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
