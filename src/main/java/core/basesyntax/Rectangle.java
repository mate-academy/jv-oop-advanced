package core.basesyntax;

public class Rectangle extends Figure implements Area, Draw {
    private double sideOne;
    private double sideTwo;

    public Rectangle(Color randomColor, double v, double v1) {
        super.setColor(randomColor);
        this.sideOne = v;
        this.sideTwo = v1;
    }

    public double getSideOne() {
        return this.sideOne;
    }

    public void setSideOne(double sideOne) {
        if (sideOne > 0) {
            this.sideOne = sideOne;
        } else {
            System.out.println("Bok nie może być mniejszy od 0");
        }
    }

    public double getSideTwo() {
        return this.sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        if (sideTwo > 0) {
            this.sideTwo = sideTwo;
        } else {
            System.out.println("Bok nie może być mniejszy od 0");
        }
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void toDraw() {
        System.out.println("Rectangle color: " + getColor() + " Długość boku pierwszego: "
                + getSideOne() + " Długość boku drugiego: " + getSideTwo());
    }
}
