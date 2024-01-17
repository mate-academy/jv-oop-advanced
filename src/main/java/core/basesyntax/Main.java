package core.basesyntax;

public class Main {
    private static final int FIGURES_AMOUNT = 5;

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle();
        figures[1] = new IsoscelesTrapezoid();
        figures[2] = new Rectangle();
        figures[3] = new RightTriangle();
        figures[4] = new Square();
        // Выводим все фигуры
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}

