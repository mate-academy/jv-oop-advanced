package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i / 2 == 0) {
               figures[i] = figureSupplier.getRandomFigure();
               System.out.println("Figure: " + figures[i] + figures[i].getArea());
            } else {
               figures[i] = figureSupplier.getDefaultFigure();
               System.out.println(figures[i]);
            }
        }

    }
}
