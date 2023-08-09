package core.basesyntax;

public abstract class Figure implements Drawable, AreaDeterminant {
    private final String type;
    private final String color;

    public Figure(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String getDrawing() {
        return null;
    }
}
