package core.basesyntax;

public class Main {
    private static final int MAX_NUMBER_OF_FIGURES = 7;

    public static void main(String[] args) {
        Figure[] figures = new Figure[(int) (Math.random() * MAX_NUMBER_OF_FIGURES)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
