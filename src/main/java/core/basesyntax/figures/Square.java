package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder(
                String.format(BASIC_PRINT_INFO, "square", getArea(), color)
        );

        info.append(", side: ").append(String.format("%.1f", side)).append(" units");
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
