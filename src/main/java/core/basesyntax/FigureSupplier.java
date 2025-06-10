package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    // Генерирует случайную фигуру со случайными параметрами
    public Figure getRandomFigure() {
        int type = random.nextInt(5); // Случайный выбор типа фигуры (0-4)
        double param1 = 1 + random.nextDouble() * 19; // Параметры от 1 до 20
        double param2 = 1 + random.nextDouble() * 19;
        double param3 = 1 + random.nextDouble() * 19;
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(color, param1);
            case 1:
                return new Rectangle(color, param1, param2);
            case 2:
                return new RightTriangle(color, param1, param2);
            case 3:
                return new Circle(color, param1);
            case 4:
                return new IsoscelesTrapezoid(color, param1, param2, param3);
            default:
                return getDefaultFigure(); // На случай ошибки
        }
    }

    // Возвращает стандартную фигуру — белый круг радиусом 10
    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}


