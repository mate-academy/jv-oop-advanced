package core.basesyntax;

public class Main {
    private static AbstractFigure[] figures = new AbstractFigure[6];
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].setColor(colorSupplier.getRandomColor());
                figures[i].draw();
            } else {
                figureSupplier.getDefaultFigure().draw();;
            }
        }
    }
}
