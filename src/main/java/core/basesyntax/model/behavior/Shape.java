package core.basesyntax.model.behavior;

import core.basesyntax.Figure;

public interface Shape {
    void draw();

    double area();

    Figure getFigure();
}
