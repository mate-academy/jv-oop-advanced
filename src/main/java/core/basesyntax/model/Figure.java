package core.basesyntax.model;
import core.basesyntax.Draw;
import core.basesyntax.FindArea;

public abstract class Figure implements Draw, FindArea {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
