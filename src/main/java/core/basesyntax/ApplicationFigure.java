package core.basesyntax;

public class ApplicationFigure {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        System.out.println(figureSupplier.getRandomFigure());

        FigureSupplier defaultSupplier = new FigureSupplier();
        System.out.println(figureSupplier.getDefaultFigure());






    }
}
