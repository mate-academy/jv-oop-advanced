package core.basesyntax;
class Main {
    private static final int ARRAY_SIZE = 6;
    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        int half = ARRAY_SIZE / 2;
        for (int i = 0; i < half; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = half; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
