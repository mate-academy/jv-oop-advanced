package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = generateShapes();
        shapes.forEach(Shape::draw);
    }

    public static List<Shape> generateShapes() {
        RandomShapeProducer producer = new RandomShapeProducer();
        List<Shape> shapes = new ArrayList<>();

        for (int i = 0; i < new Random().nextInt(15); i++) {
            shapes.add(producer.getRandomShape());
        }

        return shapes;
    }

}
