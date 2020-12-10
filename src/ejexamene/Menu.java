/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexamene;

/**
 *
 * @author ADMINMJ
 */
public class Menu {
    private String nombre;
    private int nasistentes;
    private int ncanapes;
    private int numeroFiestas;

    public Menu(String nombre) {
        this.nombre = nombre;
        nasistentes=0;
        ncanapes=0;
        numeroFiestas=0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNasistentes() {
        return nasistentes;
    }

    public int getNcanapes() {
        return ncanapes;
    }

    public int getNumeroFiestas() {
        return numeroFiestas;
    }
    /**
     * 
     * @param canapes numero de canapes consumidos
     * @param asistentes numero de asistentes
     */
    public void actualizar(int canapes, int asistentes){
        ncanapes=ncanapes+canapes;
        nasistentes=nasistentes+asistentes;
        numeroFiestas++;
        
    }
    public int  promedioCanapes(){
        int promedio=0;
        if ( numeroFiestas!=0)
            promedio= ncanapes/numeroFiestas;
        return promedio;
    }
    
    
    
}
