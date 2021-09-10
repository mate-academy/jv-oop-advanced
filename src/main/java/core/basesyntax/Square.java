package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Draw {
    private double side;
    private String color;

    public void setParameters(int side, String color) {
        this.side = side;
        this.color = color;

    }

    @Override
    public void getParameters(int sideA,int sideB,int height,
                              int firstLeg,int secondLeg,int radius, String color) {
        this.side = sideA;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return color;
    }

    @Override
    public String behaviour() {
        return "Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + draw();
    }
}
