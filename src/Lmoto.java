public class Lmoto implements licencia{
    @Override
    public void fechaEmision() {
        System.out.println("Fecha de emision licencia moto: 2019");
    }

    @Override
    public void fechaExpiracion() {
        System.out.println("Fecha de expiracion licencia moto: 2024");
    }

    @Override
    public void tipo(int profesional) {
        if(profesional==0){
            System.out.println("La licencia de moto es Profesional");
        }
        if(profesional==1){
            System.out.println("La licencia de moto  NO Profesional");
        }
    }

    @Override
    public void tipo(int profesional, int licPrevia) {
        if(profesional==0 && licPrevia==0){
            System.out.println("La licencia de moto no reuiqere una licencia previa");
        }
    }


    @Override
    public void costo() {
        licencia.super.costo();
    }
}
