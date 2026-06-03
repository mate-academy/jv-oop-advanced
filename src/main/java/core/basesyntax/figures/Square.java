package core.basesyntax.figures;

import java.util.Map;

import static java.lang.Math.pow;

public class Square extends Figure {
    public Square(String color, int side) {
        super(color, pow(side, 2.0), Map.of("side", side));
    }
}
