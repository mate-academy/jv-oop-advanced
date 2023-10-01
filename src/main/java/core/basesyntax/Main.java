package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayOfFigures = new Figure[5];
        for (int i = 0; i < arrayOfFigures.length / 2; i++) {
            arrayOfFigures[i] = new Figure().getRandomFigure();
        }
        for (int i = arrayOfFigures.length / 2; i < arrayOfFigures.length; i++) {
            arrayOfFigures[i] = new Figure().getDefaultFigure();
        }
        for (Figure figure : arrayOfFigures) {
            figure.draw();
        }
    }
}
