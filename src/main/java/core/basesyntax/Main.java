package core.basesyntax;

public class Main {
    public static final int REQUESTED_ARRAY_LENGTH = 6;
    public static final int REQUESTED_PART = 2;

    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[REQUESTED_ARRAY_LENGTH];

        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < REQUESTED_ARRAY_LENGTH; i++) {
            if (i <= REQUESTED_PART) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
            figuresArray[i].draw();
        }
    }
}
