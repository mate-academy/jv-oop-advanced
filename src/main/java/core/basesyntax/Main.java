package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSuplier newFigure = new FigureSuplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                figures[i] = newFigure.getRandomFigure();
            } else {
                figures[i] = newFigure.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
