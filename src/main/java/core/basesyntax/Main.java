package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figuresArray = new Figure[(int)(Math.random() * 25) + 5];

        for (int i = 0; i < figuresArray.length; i++) {
            figuresArray[i] = FigureProducer.getFigure();
        }

        for (Figure figure: figuresArray) {
            figure.draw();
        }
    }
}
