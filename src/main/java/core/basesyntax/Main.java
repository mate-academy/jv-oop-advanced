package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arrayNumber = 7;
        Figure[] figures = new Figure[arrayNumber];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length / 2; i++) {
            System.out.println(figureSupplier.getRandomFigure().draw());
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            System.out.println(figureSupplier.getDefaultFigure().draw());
        }
    }
}
