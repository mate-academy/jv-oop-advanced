package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder(
                String.format(BASIC_PRINT_INFO, "rectangle", getArea(), color)
        );

        info.append(", height: ").append(String.format("%.1f", height)).append(" units");
        info.append(", width: ").append(String.format("%.1f", width)).append(" units");
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
