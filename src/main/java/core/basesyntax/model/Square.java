package core.basesyntax.model;

public class Square extends Figure {
    private Integer sideLength;

    public Square(String color, Integer sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public Double calculateArea() {
        return (double) (sideLength * sideLength);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculateArea() + " sq. units, sideLength: "
                + sideLength + " units, color: "
                + getColor().toLowerCase());
    }
}
