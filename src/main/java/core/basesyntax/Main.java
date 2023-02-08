package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        int i = 0;
        for (; i < figure.length / 2; i++) {
            figure[i] = new FigureSupplier().getRandomFigure();
            System.out.println(figure[i].draw());
        }
        while (i != figure.length) {
            figure[i] = new FigureSupplier().getDefaultFigure();
            System.out.println(figure[i].draw());
            i++;
        }
    }
}

