package core.basesyntax.figures;

import java.util.Map;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {
    public Circle(String color, int radius) {
        super(color, calculateArea(radius), Map.of("radius", radius));
    }

    private static double calculateArea(int radius) {
        return PI * pow(radius, 2);
    }
}