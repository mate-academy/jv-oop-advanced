package core.basesyntax;

public class Application {

    FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {



        Figure[] figures = new  Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i <= figures.length / 2) {
                figures[i] = figureSupplier.draw();
                System.out.println(figures[i]);
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i]);
            }
        }
    }

}
