package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    //Питання: Метод getRandomFigure() повинен повертати фігуру з рандомними властивостім. Тобто
    // потрібно вибрати радномниу фігуру, а для її створення свіч-куйсом пройтись і створити
    // фігуру залежно від нази в енамі i зарандомити її параметри?
    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        Figure figure = new Square(0,null);
        switch (index) {
            case 0:
                figure = new Square(random.nextInt(100),colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(100), random.nextInt(100),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(random.nextInt(100), random.nextInt(100),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(random.nextInt(100), colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(100),
                        random.nextInt(100), colorSupplier.getRandomColor());
                break;
            default:
                figure = new FigureSupplier().getRandomFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
