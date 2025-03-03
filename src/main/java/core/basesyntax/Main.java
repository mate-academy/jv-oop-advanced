package core.basesyntax;


public class Main {
    private static final FigureSupplier FIGURESUPPLIER = new FigureSupplier();
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FIGURESUPPLIER.getRandomFigure();
        }
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
