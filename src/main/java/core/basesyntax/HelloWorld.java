package core.basesyntax;

public class HelloWorld {
    public static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < FIGURES_NUMBER / 2) ? figureSupplier.getRandomFigure() :
                    figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
