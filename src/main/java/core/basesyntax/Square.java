package core.basesyntax;

public class Square extends Figure implements Area {

    private double side;

    public Square(Color randomColor, double v) {
        super.setColor(randomColor);
        this.side = v;
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        if (side > 0) this.side = side;
        else System.out.println("Bok nie może być mniejszy od 0");
    }
    @Override
    public double getArea() {  // metoda statyczna
        return side * side;
    }
    @Override
    public String toString() {
        System.out.println("Square color: " + getColor() + " Długość boku: " + getSide());
        return super.toString();
    }
}
