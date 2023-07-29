package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static Random random = new Random();

    public static Figure getRandomFigure() {
        int figureNumber = random.nextInt(5);
        ColorSuplier colorSuplier = new ColorSuplier();
        Random random = new Random();
        Circle circle = new Circle(colorSuplier.getRandomColor(),random.nextInt());
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(
                colorSuplier.getRandomColor(),random.nextInt(),
                random.nextInt(), random.nextInt());
        Rectangle rectangle = new Rectangle(colorSuplier.getRandomColor(),random.nextInt(),
                random.nextInt());
        RightTriangle rightTriangle = new RightTriangle(colorSuplier.getRandomColor(),
                random.nextInt(), random.nextInt());
        Square square = new Square(colorSuplier.getRandomColor(), random.nextInt());
        Figure[] figures = {circle,isoscelesTrapezoid,rectangle,square,rightTriangle};
        return figures[figureNumber];
    }

    public static Figure getDefaultFigure() {
        return new Circle("White",10);
    }
}
