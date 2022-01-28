package core.basesyntax;

public class FigureMain {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < 3; i++) {
            figure[i] = FigureSuplier.getRandomFigure();
        }
        for (int i = 3; i < 6; i++) {
            figure[i] = FigureSuplier.getDefaultFigure();
        }
        for (Figure fig : figure) {
            fig.getArea();
            fig.draw();
        }
    }

}
