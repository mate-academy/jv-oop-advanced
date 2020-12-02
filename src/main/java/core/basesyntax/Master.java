package core.basesyntax;

public class Master {
    public static void main(String[] args) {

        Figure[] randomArrayOfRandomFigures = new Figure[FigureGenerator.getRandomNumber()];

        for (int i = 0; i < randomArrayOfRandomFigures.length; i++) {
            randomArrayOfRandomFigures[i] = FigureGenerator.create();
            randomArrayOfRandomFigures[i].draw();
        }
    }
}
