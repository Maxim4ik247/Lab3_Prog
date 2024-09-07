public class Human extends Character {
    public Human(String name) {
        super(name);
    }
    public void drinkCoffeeFaceToFace(Character character, Coffee coffee){
        if (this.equals(character)){
            System.out.println("Coffe cant be drinked with yourself");
            return;
        }
        System.out.println(this + " drinks coffee with " + character);
        coffee.drink();
    }
    public void feel(Emotions emotion){
        System.out.println(this + " is " + emotion.name());
    }
}
