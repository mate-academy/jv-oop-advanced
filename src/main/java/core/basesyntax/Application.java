package core.basesyntax;

public class Application {
    private static final int figuresCount = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArr = new Figure[figuresCount];

        for (int i = 0; i < (int) figuresCount / 2; i++) {
            figureArr[i] = figureSupplier.getRandomFigure();
        }
        for (int i = (int) figuresCount / 2; i < figuresCount; i++) {
            figureArr[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figureArr) {
            System.out.println(figure.toString());
        }
    }
}
