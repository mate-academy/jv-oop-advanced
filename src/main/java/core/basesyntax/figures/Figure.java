package core.basesyntax.figures;

import java.util.HashMap;

public interface Figure {
    double getArea();

    double getPerimeter();

    String getColor();

    void draw();

    static HashMap<Integer, String> generateColors() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");

        return colors;
    }
}
