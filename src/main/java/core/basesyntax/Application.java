package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier fs = new FigureSupplier();
        Figure[] figures = new Figure[Constant.NUMBER_OF_FIGURES_TO_CREATE];
        for (int i = 0; i < Constant.NUMBER_OF_FIGURES_TO_CREATE / 2; i++) {
            figures[i] = fs.getRandomFigure();
            figures[i + Constant.NUMBER_OF_FIGURES_TO_CREATE / 2] = fs.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
