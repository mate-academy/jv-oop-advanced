package core.basesyntax;

public class CollorSupplier {
    public String getRandomColor() {
        switch ((int) (Math.random() * 5)) {
            case 1: return "yellow";
            case 2: return "green";
            case 3: return "pink";
            case 4: return "blue";
            default: return "red";
        }
    }
}
