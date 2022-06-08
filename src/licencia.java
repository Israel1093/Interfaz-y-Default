public interface licencia {
    public void fechaEmision();
    public void fechaExpiracion();
    public void tipo(int profesional);
    public void tipo(int profesional, int licPrevia);
    default void costo(){
        System.out.println("El costo de la licencia es 100");
    }

}
