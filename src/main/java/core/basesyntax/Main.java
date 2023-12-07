package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[10];

        for (int i = 0; i<5; i ++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
            System.out.println(figures[i] + "\n");
            figures[i+5] = figureSupplier.getDefaultFigure();
        }

        System.out.println("////////////////////////Default/////////////////////");

        for (int i = 5; i<figures.length; i ++) {
            figures[i].draw();
            System.out.println(figures[i]);

        }
    }
}
