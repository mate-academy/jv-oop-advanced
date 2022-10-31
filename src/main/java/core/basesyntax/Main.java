package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figureLists = new Figure[6];

        for (int i = 0; i < figureLists.length / 2; i++) {
            figureLists[i] = new FigureSupplier().getRandomFigure();
        }
        figureLists[3] = new FigureSupplier().getDefaultFigure();
        figureLists[4] = new Rectangle("GREEN", 2, 5);
        figureLists[5] = new Square("BLACK", 3);

        for (Figure temp : figureLists) {
            temp.draw();
        }
    }
}
