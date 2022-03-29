package core.basesyntax;

class Main {
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(1,1, colorSupplier);
        Figure circle = figureSupplier.getDefaultFigure();
        Figure[] equal = getFig();
        for (int i = 0; i < equal.length; i++) {
            if (i < equal.length / 2) {
                equal[i].draw();
            } else {
                circle.draw();
                break;
            }
        }
    }

    public static Figure[] getFig() {
        FigureSupplier figureSupplier = new FigureSupplier(6,50, colorSupplier);
        Figure[] types = new Figure[6];
        for (int i = 0; i < 6; i++) {
            types[i] = figureSupplier.getRandomFigure();
        }
        return types;
    }
}
