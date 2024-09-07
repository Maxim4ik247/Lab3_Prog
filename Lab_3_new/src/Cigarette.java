public class Cigarette implements Smokable {
    @Override
    public void smoke() {
        System.out.println("Cigarette is smoked");
    }

    @Override
    public String toString() {
        return "Cigarette{}";
    }
}
