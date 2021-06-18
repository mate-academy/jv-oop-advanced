package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        final int Max_Figures_Count = 10;
        Figure[] figures = new Figure[Max_Figures_Count];
        int random = 1 + (int)(Math.random() * Max_Figures_Count);

        for (int i = 0; i <= random - 1; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (int i = 0; i <= random - 1; i++) {
            figures[i].draw();
        }
    }
}
