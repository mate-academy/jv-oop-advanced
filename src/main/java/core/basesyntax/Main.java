package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i < figure.length / 2) {
                figure[i] = new FigureSupplier().getRandomFigure();
                System.out.println(figure[i].draw());
            }
            if (i > figure.length / 2) {
                figure[i] = new FigureSupplier().getDefaultFigure();
                System.out.println(figure[i].draw());
            }
        }
    }
}
