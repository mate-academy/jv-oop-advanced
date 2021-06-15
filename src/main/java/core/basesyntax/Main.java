package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        final int MAX_FIGURES_COUNT = 10;
        Figure[] figures = new Figure[MAX_FIGURES_COUNT];
        int random = 1 + (int)(Math.random() * MAX_FIGURES_COUNT);

        for (int i = 0; i <= random - 1; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        };

        for (int i = 0; i <= random - 1; i++) {
            figures[i].draw();
        };
    }
}
