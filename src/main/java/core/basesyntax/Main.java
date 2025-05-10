package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSuplier figureSuplier = new FigureSuplier();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (ARRAY_SIZE / 2 > i) {
                figures[i] = figureSuplier.getRandomFigure();
            } else {
                figures[i] = figureSuplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
