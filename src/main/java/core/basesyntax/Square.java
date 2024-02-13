package core.basesyntax;

class Square extends Figure {
    int leg;

    @Override
    public Double area() {
        return (double) leg * leg;
    }

    @Override
    public void info() {
        System.out.println("Figure: square, area: " + area() + " sq. units, leg: " + leg
                +  " units, color: " + color);
    }
}
