package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresList = new Figure[6];

        for (int i = 0; i < figuresList.length; i++) {
            if (i < 3) {
                figuresList[i] = figureSupplier.getRandomFigure();
            } else {
                figuresList[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(figuresList[i]);
        }
    }
}
