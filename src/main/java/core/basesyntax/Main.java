package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figures[] figuresArray = new Figures[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figuresArray[i] = figureSupplier.getRandomFigure();
            } else {
                figuresArray[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figures i : figuresArray) {
            i.draw();
        }
    }
}
