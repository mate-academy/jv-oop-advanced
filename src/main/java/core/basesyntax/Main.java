package core.basesyntax;

public class Main {
    public static void main(String[] arg) {
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length/2; i++) {
            figures[i] = new FigureSuplier().getRandomFigure();
        }

        for (int i = 3; i < figures.length; i++) {
            figures[i] = new FigureSuplier().getDeafoltFigure();
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
