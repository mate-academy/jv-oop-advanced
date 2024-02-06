package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = new FigureSupplier().getRandomFigure();
                System.out.println(figures[i].getFigureInformation());
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
                System.out.println(figures[i].getFigureInformation());
            }
        }
    }
}
