package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Figure: rectangle, area: %.2f sq. units, width: %.2f units, height: %.2f units, color: %s",
                getArea(), width, height, color
        ));
    }
}
