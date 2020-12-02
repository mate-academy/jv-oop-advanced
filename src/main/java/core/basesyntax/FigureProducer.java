package core.basesyntax;

import java.util.Random;

public class FigureProducer implements Fillable {

    public Shape[] fill() {
        Random rand = new Random();
        Shape[] shapeArr = new Shape[generateRandomArrayLength()];
        Shape shape = null;
        for (int i = 0; i < shapeArr.length; i++) {
            switch (rand.nextInt(4)) {
                case 0:
                    shape = new Square("square", new FigureProducer());
                    break;
                case 1:
                    shape = new Rectangle("rectangle", new FigureProducer());
                    break;
                case 2:
                    shape = new Circle("circle", new FigureProducer());
                    break;
                case 3:
                    shape = new RightTriangle("right triangle",new FigureProducer());
                    break;
                case 4:
                    shape = new IsoscelesTrapezoid("trapezoid", new FigureProducer());
                    break;
                default:
            }
            shapeArr[i] = shape;
        }
        return shapeArr;
    }

    public static int generateRandomArrayLength() {
        int generator = (int)(20 + Math.random() * 60);
        return generator;
    }

    public int generatorNumber() {
        return (int)(1 + Math.random() * 20);
    }
}
