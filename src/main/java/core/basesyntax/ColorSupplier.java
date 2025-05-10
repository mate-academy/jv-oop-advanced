package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        int colorAmount = 5;
        int choice = (int)(Math.random() * colorAmount + 1);
        switch (choice) {
            case 1 :
                return "white";
            case 2 :
                return "black";
            case 3 :
                return "red";
            case 4 :
                return "green";
            case 5 :
                return "yellow";
            default:
                return "wrong color";
        }
    }
}
