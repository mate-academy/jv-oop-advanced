package core.basesyntax;

public class Main {
    public static final ColorSupplier colorSupplier = new ColorSupplier();
    public static final FigureSupplier figureSupplier = new FigureSupplier(colorSupplier);

    public static void main(String[] args) {
        InfoPrint[] figures = new InfoPrint[6];
        InfoPrint randomFigure = figureSupplier.getRandomFigure();
        InfoPrint defaultFigure = figureSupplier.getDefaultFigure();
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = randomFigure;
            } else {
                figures[i] = defaultFigure;
            }
        }

        for (InfoPrint figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
