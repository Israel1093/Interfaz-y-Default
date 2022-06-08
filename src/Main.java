public class Main {
    public static void main(String[] args) {
        Lcarro carro=new Lcarro();
        Lmoto moto=new Lmoto();
        Ltaxi taxi=new Ltaxi();
        carro.tipo(0);
        carro.tipo(1,0);
        moto.tipo(0);
        moto.tipo(1,0);
        taxi.tipo(1);
        taxi.tipo(1,0);

    }
}