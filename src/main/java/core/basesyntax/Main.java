package core.basesyntax;

public class Main {
    private FigureSupplier figureSupplier = new FigureSupplier();

    public void main(String[] args) {
        Figure[] figures = new Figure[10];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
