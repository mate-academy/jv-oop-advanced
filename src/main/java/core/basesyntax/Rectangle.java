package core.basesyntax;

public class Rectangle extends Figure {
    private double randFirstSide;
    private double randSecondSide;

    public Rectangle(double side, String color) {
        this.randFirstSide = side;
        this.randSecondSide = side;
        this.color = color;
    }

    @Override
    public double draw() {
        double rectangleArea = randFirstSide * randSecondSide;
        return rectangleArea;
    }

    @Override
    public String areaName() {
        String rectangleName = this.getClass().getSimpleName();
        return rectangleName;
    }

    @Override
    public String toString() {
        return "Figure: " + areaName() + ", area: " + draw() + " sq. units, first side: "
                + randFirstSide + " units, second side: "
                + randSecondSide + " units, color: " + color;

    }

}
