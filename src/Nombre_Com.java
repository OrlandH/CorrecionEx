public class Nombre_Com {
    private String name;

    public Nombre_Com(String name) {
        this.name = name;
    }

    public Nombre_Com(){super();}
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void establecer_name(String aux){
        System.out.println("Se a establecido el nombre de la comida");
        setName(aux);
    }
    public void imp_name(){
        System.out.println("El nombre de la comida es: " + getName());
    }
}
