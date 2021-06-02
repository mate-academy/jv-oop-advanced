package state;

public class Square implements Shape {
    double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
