package core.basesyntax;

import java.util.Random;

public class FigureSupplier{
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure(Figure[] figures){
        int index = random.nextInt(figures.length);
        if(index == 0){
            Figure circle = new Circle(random.nextDouble(20), colorSupplier.getRandomColor());
            return circle;
        } else if(index == 1){
            Figure rectangle = new Rectangle(random.nextDouble(20), random.nextDouble(20),
                    colorSupplier.getRandomColor());
            return rectangle;
        } else if (index == 2){
            Figure rightTriangle = new RightTriangle(random.nextDouble(20), colorSupplier.getRandomColor());
            return rightTriangle;
        } else if (index == 3) {
            Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextDouble(20),
                    random.nextDouble(20), random.nextDouble(20), colorSupplier.getRandomColor());
            return isoscelesTrapezoid;
        } else{
            Figure square = new Square(random.nextDouble(20), colorSupplier.getRandomColor());
            return square;
        }
    }

    public Figure getDefaultFigure(){
        Figure circle = new Circle(10, "White");
        return circle;
    }
}
