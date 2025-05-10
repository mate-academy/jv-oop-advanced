package core.basesyntax;

public class Main {
    private static final int TASK_NUMBER = 6;
    private static final int HALF_OF_TASK_NUMBER = TASK_NUMBER / 2 - 1;

    public static void main(String[] args) {

        Figure[] figures = new Figure[TASK_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i <= HALF_OF_TASK_NUMBER) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.infoAboutFigure();
        }
    }
}
