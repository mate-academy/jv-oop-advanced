package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getRandomFigure();
        Figure[] figurs = new Figure[2];
        Figure circle = new FigureSupplier().getDefaultFigure();
        for (int i = 0; i < figurs.length; i++) {
            if (i < 1) {
                figurs[i] = randomFigure;
                randomFigure.draw();
            }
            if (i == 1) {
                figurs[i] = circle;
                circle.draw();
            }
        }
    }
}
