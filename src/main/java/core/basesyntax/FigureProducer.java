package core.basesyntax;

import java.util.Random;

public class FigureProducer implements Fillable {

    public Shape[] fill() {
        Random rand = new Random();
        Shape[] shapeArr = new Shape[generateRandomArrayLength()];
        Shape shape = null;
        for (int i = 0; i < shapeArr.length; i++) {
            ColorProducer colorProducer = new ColorProducer();
            FigureProducer figureProducer = new FigureProducer();
            switch (rand.nextInt(4)) {
                case 0:
                    shape = new Square("square",figureProducer,colorProducer);
                    break;
                case 1:
                    shape = new Rectangle("rectangle",figureProducer,colorProducer);
                    break;
                case 2:
                    shape = new Circle("circle",figureProducer,colorProducer);
                    break;
                case 3:
                    shape = new RightTriangle("right triangle",figureProducer,colorProducer);
                    break;
                case 4:
                    shape = new IsoscelesTrapezoid("trapezoid",figureProducer,colorProducer);
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

    public int generateRandomNumber() {
        return (int)(1 + Math.random() * 20);
    }
}
