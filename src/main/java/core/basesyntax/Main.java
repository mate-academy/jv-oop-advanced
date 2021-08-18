package core.basesyntax;

import static core.basesyntax.Figure.FIGURE_COUNT;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figure = new Figure[(int) FIGURE_COUNT];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = random.getRandomFigure();
        }
        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
