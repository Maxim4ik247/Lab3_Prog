public class Karlson extends Character{
    public Karlson(String name,Cigarette cigarette) {
        super(name);
        this.cigarette = cigarette;
    }
    public void smoke() {
        System.out.println("karlson smokes");
        cigarette.smoke();
    }
    public Cigarette cigarette;
    public void doWithCeremony() {
        System.out.println("Karlson is doing ceremony");
    }
    public void doWithoutCeremony() {
        System.out.println("Karlson is not doing ceremony");
    }
}
