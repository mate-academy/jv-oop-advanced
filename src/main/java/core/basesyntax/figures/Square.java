package core.basesyntax.figures;

import static java.lang.Math.pow;

import java.util.Map;

public class Square extends Figure {
    public Square(String color, int side) {
        super(color, pow(side, 2.0), Map.of("side", side));
    }
}
