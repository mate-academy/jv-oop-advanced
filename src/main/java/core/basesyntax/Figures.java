package core.basesyntax;

public abstract class Figures implements Draw {
    private final String figure;
    private final String color;

    public Figures(String figure, String color) {
        this.figure = figure;
        this.color = color;
    }

    public String getFigure() {
        return figure;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        Figures[] array = new Figures[6];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = supplier.getRandomFigure();
            } else {
                array[i] = supplier.getDefaultFigure();
            }
        }
        for (Figures i : array) {
            i.getInformation();
        }

    }

}
