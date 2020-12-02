package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureProducer figureProducer = new FigureProducer();
        Figure[] figures = new Figure[10];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureProducer.getRandomFigure();
        }
        getInfoAboutFigures(figures);
        drawFigure(figures);
    }

    private static void getInfoAboutFigures(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    private static void drawFigure(Figure[] figures) {
        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}
