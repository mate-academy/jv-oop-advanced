package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        private final static int CONSTANT = 5;
        Figure[] figuresArray = new Figure[CONSTANT];
        FigureSupplier getFigure = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = getFigure.randomFigureSupplier();
            figuresArray[i].displayInfo();
        }
    }
}
