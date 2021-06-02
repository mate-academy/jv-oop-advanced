package core.basesyntax;

public class RightTriangle extends Figure implements Draw{
    private double firstSide;
    private double secondSide;
    private double hypotenuse;
    public RightTriangle(String color, double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));


    }
    @Override
    public void draw() {

    }
}
