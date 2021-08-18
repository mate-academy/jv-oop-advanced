package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figurea = new Square();
        Randomizer randomizer = new Randomizer();
        Figure[] figure = new Figure[randomizer.getRandomNumber()];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figurea.getRandomFigure();
        }
        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
