package core.basesyntax.figures;

import java.util.Map;

public class RightTriangle extends Figure {
    public RightTriangle(String color, int sideA, int sideB) {
        super(color, sideA * sideB / 2.0, Map.of("sideA", sideA, "sideB", sideB));
    }
}
