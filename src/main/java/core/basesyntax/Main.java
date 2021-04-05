package core.basesyntax;

public class Main {
    public static final int RANDOM_LIMIT = 23;

    public static void main(String[] args) {
        Figure[] figuresList = new Figure[(int) (Math.random() * RANDOM_LIMIT)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresList.length; i++) {
            figuresList[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figuresList) {
            System.out.println(figure.draw());
        }
    }
}
