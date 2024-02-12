package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSuplier figureSuplier = new FigureSuplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < 6; i++) {
            figures[i] = i < 3 ? figureSuplier.getRandomFigure()
                    : figureSuplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
