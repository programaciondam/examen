/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexamene;

import utilidades.Utilidad;

/**
 *
 * @author ADMINMJ
 */
public class Empresa {
    Menu menu1;
    Menu menu2;

    public Empresa() {
        menu1=new Menu("INFANTIL");
        menu2=new Menu("ADULTO");
        
    }
    public void pedir(){
        int ncanapes;
        int asistentes;
        String tipoMenu;
        
        tipoMenu=pedirMenu();
        while (!tipoMenu.equalsIgnoreCase("fin"))
        {
            asistentes=Utilidad.pedirNumeroEntero
                ("Numero de asistentes", 1, Integer.MAX_VALUE);
            ncanapes=Utilidad.pedirNumeroEntero
                ("Numero de canapes", 1, Integer.MAX_VALUE);
            if(tipoMenu.equalsIgnoreCase(menu1.getNombre())){
                menu1.actualizar(ncanapes,asistentes);
            } else{
              menu2.actualizar(ncanapes, asistentes);              
            }
            tipoMenu=pedirMenu();
            
            
        }
        
    }

    private String pedirMenu() {
        String tipo="";
        tipo=Utilidad.pedirString("tipoMenu");
        while (tipo.compareToIgnoreCase(menu1.getNombre())!=0 &&
                tipo.compareToIgnoreCase(menu2.getNombre())!=0 &&
                tipo.compareToIgnoreCase("fin")!=0 )
        {
            System.out.println("Ese opcion no es valida");
                tipo=Utilidad.pedirString("tipoMenu");
        }
                return tipo;
    }   
    public void informe(){
        System.out.println("Tipo Menu\t N Asistentes\t Promedio \t Porcentaje");
        System.out.println(menu1.getNombre()+"\t"+menu1.getNasistentes()+"\t"+ menu1.promedioCanapes()+"\t"+porFiestas1());
         System.out.println(menu2.getNombre()+"\t"+menu2.getNasistentes()+"\t"+ menu2.promedioCanapes()+"\t"+porFiestas2());
    }
    
    public int totalFiestas(){
        int total;
       total=menu1.getNumeroFiestas()+menu2.getNumeroFiestas();
       return total;
    }
    private float porFiestas1(){
        float por=0;
        int total=totalFiestas();
        if ( total!=0){
            por=(float)menu1.getNumeroFiestas()/total;
        }
        return por;
    }
      private float porFiestas2(){
        float por=0;
        int total=totalFiestas();
        if ( total!=0){
            por=(float)menu2.getNumeroFiestas()/total;
        }
        return por;
    }
    public String masDemandado(){
        String valor;
        if ( menu1.getNumeroFiestas()>menu2.getNumeroFiestas())
            valor=menu1.getNombre();
        else
            valor=menu2.getNombre();
        return valor;
            
    }
    
}
