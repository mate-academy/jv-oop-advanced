package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Figure figure1 = new FigureSupplier().getRandomFigure();
        Figure figure2 = new FigureSupplier().getRandomFigure();
        Figure figure3 = new FigureSupplier().getDefaultFigure();
        Figure[] figures = new Figure[] {figure1, figure2, figure3};
        for (Figure figure : figures) {
            figure.draw();
        }

    }
}
