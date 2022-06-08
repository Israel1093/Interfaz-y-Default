public class Lcarro implements licencia{
    @Override
    public void fechaEmision() {
        System.out.println("Fecha de emision licencia carro: 2020");

    }

    @Override
    public void fechaExpiracion() {
        System.out.println("Fecha de expiracion licencia carro: 2025");
    }

    @Override
    public void tipo(int profesional) {
        if(profesional==0){
            System.out.println("La licencia de carro es Profesional");
        }
        if(profesional==1){
            System.out.println("La licencia de carro  NO Profesional");
        }
    }

    @Override
    public void tipo(int profesional, int licPrevia) {
        if(profesional==1 && licPrevia==0){
            System.out.println("La licencia de carro no reuiqere una licencia previa");
        }
    }

    @Override
    public void costo() {
        licencia.super.costo();
    }
}
