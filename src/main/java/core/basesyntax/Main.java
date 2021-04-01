package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        final int figuresNumber = 20;

        Figure[] randomFigureArray = new Figure[(int)((Math.random() * figuresNumber))];

        for (int i = 0; i < randomFigureArray.length; i++) {
            randomFigureArray[i] = FigureProducer.getRandomFigure();
        }

        for (Figure figure : randomFigureArray) {
            figure.draw();
        }
    }
}
