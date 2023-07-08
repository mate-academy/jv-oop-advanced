package core.basesyntax;

public class RightTriangle extends Figure {
    private double catOne;
    private double catTwo;

    public RightTriangle(double catOne, double catTwo, String color) {
        super(color);
        this.catOne = catOne;
        this.catTwo = catTwo;
        //this.color = color;
    }

    @Override
    public double getArea() {
        return (catOne * catTwo) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: прямокутний трикутник, площа: " + getArea()
                + " , катет1: " + catOne + " , катет2: " + catTwo + " , колір: " + color);
    }
}
