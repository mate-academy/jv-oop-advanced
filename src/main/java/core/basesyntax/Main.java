package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int constant = 5;
        Figure[] figuresArray = new Figure[constant];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = figureSupplier.hetRandomFigure();
            figuresArray[i].displayInfo();
        }
    }
}
