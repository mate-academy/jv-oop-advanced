package core.basesyntax;

public class Main {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure figure = null;
        for(int i = 0; i < 6; i++) {
            figure = figureSupplier.getRandomFigure();
            System.out.println(figure.draw());
        }
    }
}