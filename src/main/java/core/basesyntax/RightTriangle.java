package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(Color color, double side, double height) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
    public double getArea() {
        return ((height * side) / 2);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Right Triangle color is: ").append(getColor()).append(", area: ")
                .append(getArea()).append(", side:").append(side).append(", height: ")
                .append(height);
        System.out.println(stringBuilder);
    }
}
