package core.basesyntax;

public class ApplicationFigure {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getRandomFigure());
        }


        FigureSupplier defaultSupplier = new FigureSupplier();
        System.out.println(figureSupplier.getDefaultFigure());






    }
}
