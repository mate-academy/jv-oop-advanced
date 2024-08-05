package core.basesyntax;

public class Main {
    public static final int REQUESTED_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure [REQUESTED_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i <= 5; i++) {
            if (i <= 2) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
            figuresArray[i].draw();
        }
    }
}
