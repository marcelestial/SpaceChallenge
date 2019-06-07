public class Rocket implements Spaceship {

    public Rocket(){

    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        boolean carriable = true;
        //implement canCarry method: does item exceed weight limit?
        return carriable;
    }

    @Override
    public void carry(Item item) {
        //update weight of rocket
    }
}
