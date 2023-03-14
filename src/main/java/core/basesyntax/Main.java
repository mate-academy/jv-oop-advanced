package core.basesyntax;

public class Main {
    public static final int ARRAY_SIZE = 6;
    public static final int HALF_ARRAY_SIZE = ARRAY_SIZE/2;
    
    public static void main(String[] args) {
        Figure [] arrayOfFigures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        
        for (int i = 0, y = HALF_ARRAY_SIZE; i < HALF_ARRAY_SIZE; i++, y++) {
            arrayOfFigures[i] = figureSupplier.getRandomFigure();
            arrayOfFigures[y] = figureSupplier.getDefaultFigure();
        }
        
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }
    }
}
