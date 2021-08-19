package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[5];
        FigureSupplier getFigure = new FigureSupplier();
        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = getFigure.randomFigureSupplier();
            figuresArray[i].displayInfo();
        }
    }
}
