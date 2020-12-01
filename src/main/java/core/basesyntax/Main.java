package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure[] arrayOfFigure = new Figure[(int)(Math.random() * 20) + 3];

        for (Figure figure : arrayOfFigure) {
            figure = FigureGenerator.getFigure();
            figure.infoAboutFigure();
        }
    }
}
