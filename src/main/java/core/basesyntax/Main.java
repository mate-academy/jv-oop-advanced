package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        int figuresAmount = figureSupplier.getRandom().nextInt(FigureSupplier.FIGURE_COUNT);
        Figure[] figures = new Figure[figuresAmount];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].printInfo();
        }
    }
}
