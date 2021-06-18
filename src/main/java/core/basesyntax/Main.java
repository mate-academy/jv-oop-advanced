package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int figuresNumber = 5;
        Figure[] randomArray = new Figure[(int) ((Math.random() * figuresNumber) + 1)];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = FigureSupplier.getRandomFigure();
        }
        for (Figure f : randomArray) {
            f.draw();
        }
    }
}

