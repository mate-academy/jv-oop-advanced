package core.basesyntax;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg){
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
    @Override
    void draw() {
        System.out.println("Right triangle color: " + color +
            ", First leg length = " + firstLeg +
            ", Second leg length = " + secondLeg +
            "Area = " + getArea());
    }
}
