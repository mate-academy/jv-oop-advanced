package core.basesyntax.figures;

import core.basesyntax.constants.Color;
import core.basesyntax.helpers.AreaCalculator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Figure implements Drawable, AreaCalculator {
    private final Color color;
}
