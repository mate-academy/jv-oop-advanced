package core.basesyntax;

public class Application extends FigureSupplier {
    public static void main(String[] args) {
        Figure[] area = new Figure[6];
        for (int i = 0; i < 3; i++) {
            area[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = 3; i < area.length; i++) {
            area[i] = new FigureSupplier().getDefaultFigure();
        }

        for (Figure figure: area) {
            System.out.println(figure);
        }
    }
}
