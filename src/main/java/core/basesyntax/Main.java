package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSuplier figureSuplier = new FigureSuplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSuplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSuplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            System.out.println(figure.draw());
        }

    }

}
