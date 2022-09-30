package core.basesyntax;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] arraysOfFigures = new Figure[ARRAY_LENGTH];
        FigureSupplier randomFigure = new FigureSupplier();
        for (int i = 0; i < arraysOfFigures.length; i++) {
            if (i < arraysOfFigures.length / 2) {
                arraysOfFigures[i] = randomFigure.getRandomFigure();
            } else {
                arraysOfFigures[i] = randomFigure.getDefaultFigure();
            }
            System.out.println(arraysOfFigures[i].draw());
        }
    }
}
