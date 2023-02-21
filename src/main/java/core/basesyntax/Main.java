package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println("Random figure: " + figures[i]);
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println("Default figure: " + figures[i]);
            }
        }
    }
}
