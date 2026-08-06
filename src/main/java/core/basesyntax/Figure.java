package core.basesyntax;

public abstract class Figure implements ObtainingArea {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void print();

    public static void main(String[] args) {
        FigureSupplier fs1 = new FigureSupplier();
        Figure[] figures = {
                fs1.getRandomFigure(),
                fs1.getRandomFigure(),
                fs1.getRandomFigure(),
                fs1.getRandomFigure(),
        };

        for (Figure figure : figures) {
            figure.print();
        }
    }
}

