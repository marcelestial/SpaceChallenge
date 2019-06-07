public class U1 extends Rocket {

    int weightLimit, cost, weight, lauchRisk, landRisk;

    public U1(){
        weightLimit = 18000;
        cost = 100;
        weight = 10000;
        lauchRisk = 5;
        landRisk = 1;
    }

    @Override
    public boolean land() {
        
        return super.land();
    }

    @Override
    public boolean launch(){
        return super.launch();
    }
}
