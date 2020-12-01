package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] arrayOfFigure = new Figure[(int)(Math.random() * 20) + 3];

        for (int i = 0; i < arrayOfFigure.length; i++) {
            arrayOfFigure[i] = FigureGenerator.getFigure();
        }

        for (Figure figure : arrayOfFigure) {
            System.out.println(figure.getInformation());
        }
    }
}
