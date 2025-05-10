package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figuresArray = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figuresArray[i] = figureSupplier.getRandomFigure();
            figuresArray[i].draw();
        }
        for (int i = 3; i < 6; i++) {
            figuresArray[i] = figureSupplier.getDefaultFigure();
            figuresArray[i].draw();
        }

    }
}
