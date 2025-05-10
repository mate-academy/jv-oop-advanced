package core.basesyntax;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                figures[i].draw();
            } else {
                System.out.println("Figura na pozycji " + i + " jest null.");
            }
        }
    }
}
