package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(Color.BLUE, 9, 12),
                FigureSupplier.getDefaultFigure()};

        for (Figure f : figures) {
            f.draw();
        }
        for (int i = 0; i < 5; i++) {
            FigureSupplier.getRandomFigure().draw();
        }
    }
}
