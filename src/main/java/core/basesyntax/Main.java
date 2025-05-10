package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int length = 10;
        Figure[] figures = new Figure[length];

        for (int i = 0; i < length; i++) {
            if (i < length / 2) {
                figures[i] = figureSupplier.getRandomFigure();    
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }

}
