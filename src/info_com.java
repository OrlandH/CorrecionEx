public class info_com extends region_com{
    private double calorias;

    public info_com(String name, String hora_com, String reg_ec, double calorias) {
        super(name, hora_com, reg_ec);
        this.calorias = calorias;
    }
    public info_com(){super();}

    public double getCalorias() {
        return calorias;
    }

    private void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public void establecer_cal(double aux2){
        System.out.println("Se a establecido la cantidad de calorias");
        setCalorias(aux2);
    }
    public void imp_todo(){
        System.out.println("---------------------------");
        System.out.println("Nombre de la comida: " +getName());
        System.out.println("Esta comida se come normalmente en: " +getHora_com());
        System.out.println("Proviene de: " +getReg_ec());
        System.out.println("Calorias: " +getCalorias());
    }
}
