package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {


    public Figure getRandomFigure(){
        Figure randomFigure = new Figure();
        int randomIndex = new Random().nextInt(5);
        switch (randomIndex) {
            case 0 -> randomFigure = getRandomCircle();
            case 1 -> randomFigure = getIsoscelesTrapezoid();
            case 2 -> randomFigure = getRandomRectangle();
            case 3 -> randomFigure = getRightTriangle();
            case 4 -> randomFigure = getRandomSquare();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure(){
        return new Circle(Color.WHITE.toString().toLowerCase(), FigureName.CIRCLE.toString().toLowerCase(), 10);
    }

    private Circle getRandomCircle(){
        return new Circle(new ColorSupplier().getRandomColor() ,FigureName.CIRCLE.toString().toLowerCase(), new Random().nextInt(101));
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid(){
        return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor() ,FigureName.ISOSCELES_TRAPEZOID.toString().toLowerCase(), new Random().nextInt(101), new Random().nextInt(101), new Random().nextInt(101));
    }

    private Rectangle getRandomRectangle(){
        return new Rectangle(new ColorSupplier().getRandomColor() ,FigureName.RECTANGLE.toString().toLowerCase(), new Random().nextInt(101), new Random().nextInt(101));
    }

    private RightTriangle getRightTriangle(){
        return new RightTriangle(new ColorSupplier().getRandomColor() ,FigureName.RIGHT_TRIANGLE.toString().toLowerCase(), new Random().nextInt(101));
    }

    private Square getRandomSquare(){
         return new Square(new ColorSupplier().getRandomColor() ,FigureName.SQUARE.toString().toLowerCase(), new Random().nextInt(101));
     }

}
