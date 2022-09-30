package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] arraysOfFigure = new Figure[10];
        for (int i = 0; i < arraysOfFigure.length / 2; i++) {
            Figure figure = figureSupplier.getDefaultFigure();
            arraysOfFigure[i] = figure;
            System.out.println(figure.draw());
        }
        for (int i = arraysOfFigure.length / 2; i < arraysOfFigure.length; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            arraysOfFigure[i] = randomFigure;
            System.out.println(randomFigure.draw());
        }
    }
}
