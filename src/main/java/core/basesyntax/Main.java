package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier x = new FigureSupplier();
        Figure[] Figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            Figures[i] = x.getRandomFigure();

        }
        for (int i = 0; i < 6; i++) {
            System.out.println(Figures[i].getFigureInfo());
        }
    }
}
