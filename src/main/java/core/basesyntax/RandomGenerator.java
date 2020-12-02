package core.basesyntax;

public class RandomGenerator {

    public void getRandom() {
        int length = (int) (Math.random() * 10);
        Figure [] figures = new Figure [length];
        FigureRandom figureRandom = new FigureRandom();
        for (int i = 0; i < length; i++) {
            figures[i] = figureRandom.get();
            figures[i].getDraw();
        }
    }
}
