package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = Circle.getDefaultFigure();
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
