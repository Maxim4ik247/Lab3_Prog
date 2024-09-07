public class Main {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        Human frekenBock = new Human("Freken Bock");
        Human julius = new Human("Julius");
        Human baby = new Human("Baby");
        Coffee coffee = new Coffee();
        livingRoom.addVisitor(frekenBock);
        livingRoom.addVisitor(julius);
        frekenBock.drinkCoffeeFaceToFace(julius, coffee);
        Cigarette cigarette = new Cigarette();
        Karlson karlson = new Karlson("Karlson", cigarette);
        karlson.smoke();
        baby.feel(Emotions.AMAZED);
        karlson.doWithoutCeremony();
        livingRoom.addVisitor(karlson);

    }
}