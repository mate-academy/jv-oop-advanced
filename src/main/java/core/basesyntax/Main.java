package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure defaultFigure = new FigureSupplier().getDefaultFigure();
        System.out.println(defaultFigure.draw());
        Figure[] figure = new Figure[5];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = new FigureSupplier().getRandomFigure();
            System.out.println(figure[i].draw());
        }
    }
}
