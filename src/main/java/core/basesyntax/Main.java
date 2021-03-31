package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        Figure[] randomFigures = new Figure[randomNumber];
        for (int i = 0; i < randomFigures.length; i++) {
            randomFigures[i] = FigureSupplier.getFigure();
        }
        for (Figure figure : randomFigures) {
            System.out.println(figure.getProperty());
        }
    }
}
