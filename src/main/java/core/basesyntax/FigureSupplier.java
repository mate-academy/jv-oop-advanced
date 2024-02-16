package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private static final int MAX_FIGURE_SIDE_LENGTH = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURE_TYPES) + 1;
        String color = colorSupplier.getRandomColor();

        switch (index) {
            case 1:
                return new Circle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            // в common mistakes
            // було сказано не використовувати вирази але тут це напевно необхідність
            // бо ми не можемо до switch створити
            // змінну оскільки ми не знаємо яку фігуру будемо створювати, і які
            // і скільки параметрів буде
            // необхідно + фігури з усіми однаковими сторонами тут наврядчи валідні
            case 2:
                return new Square(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 3:
                return new Rectangle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 4:
                return new RightTriangle(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            case 5:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1,
                        random.nextInt(MAX_FIGURE_SIDE_LENGTH) + 1);
            default:
                return getDefaultFigure();//як я розумію цей стейтмент ніколи не виконується
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
