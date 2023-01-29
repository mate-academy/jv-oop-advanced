package core.basesyntax;

public class FigureForm {
    private String color = ColorSupplier.getRandomColor();

    public enum Figure {
        Circle, IsoscelesTrapezoid, Rectangle, RightTriangle, Square
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
