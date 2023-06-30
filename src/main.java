import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        String aux;
        double aux2;
        ArrayList <info_com> alim = new ArrayList<info_com>();
        info_com com1 = new info_com();
        info_com com2 = new info_com("Encebollado", "Almuerzo", "Costa", 2000);
        region_com com3 = new region_com("Ceviche de Camaron", "Almuerzo", "Costa");
        Nombre_Com com4 = new Nombre_Com("Locro de papa");
        Tipo_Com com5 = new Tipo_Com("Bolon", "Desayuno");

        aux = "Tigrillo";
        com1.establecer_name(aux);
        aux = "Desayuno";
        com1.establecer_hora(aux);
        aux = "Costa";
        com1.establecer_reg(aux);
        aux2 = 30.35;
        com1.establecer_cal(aux2);

        alim.add(com1);
        alim.add(com2);
        System.out.println("------------------------");
        com3.imp_reg();
        System.out.println("------------------------");
        com4.imp_name();
        System.out.println("------------------------");
        com5.imp_hora();
        System.out.println(" ");
        try {
            for (info_com alimen : alim) {
                alimen.imp_todo();
            }
        } catch (Exception e) {
            System.out.println("Algo salio mal");
        }
    }
}
