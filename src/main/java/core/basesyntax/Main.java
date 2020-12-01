package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayOfFigure = new Figure[(int)(Math.random() * 20) + 3];

        for (Figure figure : arrayOfFigure) {
            figure = FigureGenerator.getFigure();
            figure.infoAboutFigure();
        }
    }
}
