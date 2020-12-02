package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] randomLengthAndFigures = new Figure[RandomGenerator.getRandomLength()];
        for (int i = 0; i < randomLengthAndFigures.length; i++) {
            randomLengthAndFigures[i] = RandomGenerator.getRandomFigure();
            randomLengthAndFigures[i].draw();
        }
    }
}
