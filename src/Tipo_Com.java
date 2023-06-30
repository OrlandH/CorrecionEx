public class Tipo_Com extends Nombre_Com{
    private String hora_com;

    public Tipo_Com(String name, String hora_com) {
        super(name);
        this.hora_com = hora_com;
    }
    public Tipo_Com(){super();}

    public String getHora_com() {
        return hora_com;
    }

    private void setHora_com(String hora_com) {
        this.hora_com = hora_com;
    }
    public void establecer_hora(String aux){
        System.out.println("Se a establecido en que hora se come la comida");
        setHora_com(aux);
    }
    public void imp_hora(){
        System.out.println("La hora de la comida " + getName() + " es " +getHora_com());
    }
}
