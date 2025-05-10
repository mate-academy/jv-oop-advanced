package core.basesyntax;

public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSuplier figureSuplier = new FigureSuplier();

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSuplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSuplier.getDafaultFigure();
            figures[i].draw();
        }
    }
}
