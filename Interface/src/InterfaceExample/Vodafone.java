package InterfaceExample;
public class Vodafone implements Sim {
    @Override
    public void calling() {
        System.out.println("i am calling from the vodafone sim");
    }

    @Override
    public void dailling() {
        System.out.println("i am dailling from the vodafone sim");
    }

    @Override
    public void usingInternet() {
        System.out.println("i am using internet from vodafone sim ");
    }

    public void price() {
        System.out.println("the price of the vodafone sim is 500 rs per sim ");
    }
}

