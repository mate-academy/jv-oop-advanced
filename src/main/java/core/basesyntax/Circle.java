package core.basesyntax;

class Circle extends Figure {
    int radius;

    @Override
    public Double area() {
        return radius * radius *  Math.PI;
    }

    @Override
    public void info() {
        System.out.println("Figure: circle, area: " + area() + " sq. units, radius: " + radius
                +  " units, color: " + color);
    }


}
