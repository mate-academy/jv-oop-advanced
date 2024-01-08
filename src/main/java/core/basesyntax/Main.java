package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Draw[] figures = new Draw[5];
        figures[0] = new Circle();
        figures[1] = new IsoscelesTrapezoid();
        figures[2] = new Rectangle();
        figures[3] = new RightTriangle(3, 4, "Green");
        figures[4] = new Square(4, "Green");

        // Выводим все фигуры
        for (Draw figure : figures) {
            figure.draw();
        }
    }
}
