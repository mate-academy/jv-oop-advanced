package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public int areaCalculation() {
        return width * height;
    }

    @Override
    public void ableToDraw() {
        System.out.println(
                "Figure : rectangle, area: "
                        + areaCalculation()
                        + " sq.units, "
                        + "width: "
                        + width
                        + " units, "
                        + "height: "
                        + height
                        + " units, "
                        + "color: "
                        + color);
    }
}
