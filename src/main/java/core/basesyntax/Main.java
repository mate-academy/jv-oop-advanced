package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresNumber = 20;

        Figure[] randomFigureArray = new Figure[(int)((Math.random() * figuresNumber))];

        FigureProducer figureProducer = new FigureProducer();
        for (int i = 0; i < randomFigureArray.length; i++) {
            randomFigureArray[i] = figureProducer.getRandomFigure();
        }

        for (Figure figure : randomFigureArray) {
            figure.draw();
        }
    }
}
