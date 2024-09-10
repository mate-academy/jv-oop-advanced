package core.basesyntax;

public class HelloWorld {
    private static final int magicfigure = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[magicfigure];

        for (int i = 0; i < magicfigure; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }

    }

}
