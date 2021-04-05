package core.basesyntax;

public class Main {
    private static final int FIGURES_NUMBER = 20;

    public static void main(String[] args) {

        Figure[] randomFigureArray = new Figure[(int)((Math.random() * FIGURES_NUMBER))];

        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < randomFigureArray.length; i++) {
            randomFigureArray[i] = figureProducer.getRandomFigure();
        }

        for (Figure figure : randomFigureArray) {
            figure.draw();
        }
    }
}
