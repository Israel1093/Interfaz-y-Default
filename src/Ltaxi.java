public class Ltaxi implements licencia{
    @Override
    public void fechaEmision() {
        System.out.println("Fecha de emision licencia taxi: 2018");
    }

    @Override
    public void fechaExpiracion() {
        System.out.println("Fecha de expiracion licencia taxi: 2023");
    }

    @Override
    public void tipo(int profesional) {
        if(profesional==0){
            System.out.println("La licencia de taxi es Profesional");
        }
        if(profesional==1){
            System.out.println("La licencia de taxi NO es Profesional");
        }
    }

    @Override
    public void tipo(int profesional, int licPrevia) {
        if(profesional==1 && licPrevia==1){
            System.out.println("La licencia de taxi reuiqere una licencia previa");
        }
    }


    @Override
    public void costo() {
        licencia.super.costo();
    }
}
