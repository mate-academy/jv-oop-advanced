package core.basesyntax.figures;

import java.util.Map;

public class IsoscelesTrapezoid extends Figure {
    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color, (baseA + baseB) * height / 2.0,
                Map.of("baseA", baseA, "baseB", baseB, "height", height));
    }
}
