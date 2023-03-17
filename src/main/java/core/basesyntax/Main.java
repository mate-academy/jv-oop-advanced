package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        String[] figures = new String[6];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (String figure : figures) {
            System.out.println(figure);
        }

    }
}
