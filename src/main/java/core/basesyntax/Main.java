package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier firstFigure = new FigureSupplier();
        FigureSupplier secondFigure = new FigureSupplier();
        FigureSupplier thirdFigure = new FigureSupplier();
        firstFigure.getRandomFigure();
        secondFigure.getRandomFigure();
        thirdFigure.getRandomFigure();
    }
}
