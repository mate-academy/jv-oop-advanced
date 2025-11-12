public class Square extends Figure {

    private double side;
    private final String name = "Square";

    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(name + " jest koloru: " + getColor() + " jego bok wynosi: " + side + "cm. " + "Jego pole wynosi: " + getArea());
    }
}
