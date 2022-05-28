package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        String[] randomFigures = new String[FIGURES_NUMBER];
        for (int i = 0; i < randomFigures.length; i++) {
            if (i % 2 == 0) {
                randomFigures[i] = String.valueOf(figureSupplier.getRandomFigure());
            } else {
                randomFigures[i] = String.valueOf(figureSupplier.getDefaultFigure());
            }
            System.out.println(randomFigures[i]);
        }
    }
}
