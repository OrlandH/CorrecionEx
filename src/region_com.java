public class region_com extends Tipo_Com{
    private String reg_ec;

    public region_com(String name, String hora_com, String reg_ec) {
        super(name, hora_com);
        this.reg_ec = reg_ec;
    }
    public region_com(){super();}

    public String getReg_ec() {
        return reg_ec;
    }

    private void setReg_ec(String reg_ec) {
        this.reg_ec = reg_ec;
    }
    public void establecer_reg(String aux){
        System.out.println("Se a establecido de que region pertenece esta comida tipica");
        setReg_ec(aux);
    }
    public void imp_reg(){
        System.out.println("La region de la comida " + getName()+ " es: " +getReg_ec());
    }
}
