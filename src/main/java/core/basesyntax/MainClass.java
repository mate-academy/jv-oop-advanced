package core.basesyntax;

public class MainClass {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (Figure temp : figures) {
            temp.draw();
        }
    }
}
