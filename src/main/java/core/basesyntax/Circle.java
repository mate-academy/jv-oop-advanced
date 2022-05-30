package core.basesyntax;

public class Circle extends Figure {
    private double randRadius;

    public Circle(double side, String color) {
        this.randRadius = side;
        this.color = color;
    }

    @Override
    public String areaName() {
        String circleName = this.getClass().getSimpleName();
        return circleName;
    }

    @Override
    public double draw() {
        double circleArea = Math.PI * randRadius * randRadius;
        return circleArea;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + draw() + " sq. units, radius: "
                + randRadius + " units, color: " + color;

    }

}
