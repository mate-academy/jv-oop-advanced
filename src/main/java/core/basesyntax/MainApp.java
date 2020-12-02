package core.basesyntax;

public class MainApp {

    public static void main(String[] args) {
        int length = (int) (Math.random() * 10);
        Figure [] figures = new Figure [length];
        FigureRandom figureRandom = new FigureRandom();
        for (int i = 0; i < length; i++) {
            figures[i] = figureRandom.get();
            figures[i].getDraw();
        }
    }
}
