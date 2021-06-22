package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Figure[] result = new Figure[FigureSupplier.selectRandomValue()];

        for (int i = 0; i < result.length; i++) {
            result[i] = FigureSupplier.getRandomFigure();
            System.out.println(result[i].printInfo());
        }
    }
}
