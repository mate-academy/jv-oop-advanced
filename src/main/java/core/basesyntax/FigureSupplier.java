package core.basesyntax;

public class FigureSupplier {
    private static Figure[] figures =
            {new IsoscelesTrapezoid(), new Circle(), new RightTriangle(),
                    new Square(), new Rectangle()};

    public static int countOfFigures() {
        return (int)(Math.random() * 5 + 1);
    }

    public static Figure[] fillArrayOfFigures() {
        int count = countOfFigures();
        Figure[] array = new Figure[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = figures[(int)(Math.random() * 5)];
        }
        return array;
    }
}
