package core.basesyntax;
import java.util.Random;

    public class FigureSupplier {
        private final int NUM = 5;
        private ColorSupplier colorSupplier = new ColorSupplier();
        private FigureRandom figureRandom = new FigureRandom();
        Random random = new Random();

    public Figure getRandomFigure() {
        Figure[] arr = new Figure[NUM];
        Figure circle = new Circle(colorSupplier.getRandomColor(), figureRandom.getRandomNum());
        Figure square = new Square(colorSupplier.getRandomColor(), figureRandom.getRandomNum());
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), figureRandom.getRandomNum(), figureRandom.getRandomNum());
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), figureRandom.getRandomNum(), figureRandom.getRandomNum(), figureRandom.getRandomNum());
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), figureRandom.getRandomNum(), figureRandom.getRandomNum());

        arr[0] = circle;
        arr[1] = rightTriangle;
        arr[2] = square;
        arr[3] = isoscelesTrapezoid;
        arr[4] = rectangle;
        int randomFromArr = random.nextInt(NUM);;
        return arr[randomFromArr];
    }
    public Figure getDefaultFigure(){
        return new Circle("WHITE",10);
    }
}
