package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        RandomFigure randomFigure = new RandomFigure();

        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = randomFigure.getRandomFigures();
            if (i < figures.length / 2) {
                figures[i].drawFigure();
            } else {
                figures[i].getDefaultFigure().drawFigure();
            }
        }

    }
}
