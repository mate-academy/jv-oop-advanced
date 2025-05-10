package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSuplier figureSuplier = new FigureSuplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSuplier.getRandomFigure();
            figures[i + figures.length / 2] = figureSuplier.getDefaultFigure();
            figures[i].draw();
            figures[i + figures.length / 2].draw();
        }
    }
}
