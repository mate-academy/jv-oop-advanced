package core.basesyntax.figures;

//Figure: rectangle, area: 20.0 sq. units, width: 4 units, length: 5 units, color: green

import java.util.Map;

public class Rectangle extends Figure {
    public Rectangle(String color, int width, int length) {
        super(color, (double) (width * length), Map.of("width", width, "length", length));
    }
}