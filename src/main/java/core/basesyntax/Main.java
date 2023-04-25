package core.basesyntax;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        AbstractFigure[] figures = new AbstractFigure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = (AbstractFigure) figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (AbstractFigure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
