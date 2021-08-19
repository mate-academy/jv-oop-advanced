package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        int arrayL = new ArayLength().getLengthOfArray();
        ScaleFigure[] arrayOfFigures = new ScaleFigure[arrayL];

        for (int i = 0; i < arrayL; i++) {
            arrayOfFigures[i] = new FigureSupplier().getRandomFigure();
            arrayOfFigures[i].draw();
        }
    }
}
