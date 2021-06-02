package core.basesyntax;

public class MainClass {
    private static final int MAGIC_NUMBER = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAGIC_NUMBER];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure temp : figures) {
            temp.draw();
        }
    }
}
