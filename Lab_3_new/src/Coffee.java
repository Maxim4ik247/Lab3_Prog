public class Coffee implements Drinkable {
    @Override
    public void drink() {
        System.out.println("Coffee is drank");
    }

    @Override
    public String toString() {
        return "Coffee";
    }

}
