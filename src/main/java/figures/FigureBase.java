package figures;

import enumsupl.Color;
import interfaces.AreaObtainer;
import interfaces.Drawable;

public abstract class FigureBase implements AreaObtainer, Drawable {
    private Color color;

    public FigureBase(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
