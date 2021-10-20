package core.basesyntax;

public class Main {
    private static final int MAGIC_SIX = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAGIC_SIX];
        FigureSupplier figureSupplier = new FigureSupplier();
        figures[3] = new Circle(Color.GOLD, 666);
        figures[4] = new Square(Color.BLACK, 666);
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            }
            if (i == figures.length - 1) {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].drow();
        }
    }
}
