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
public class EjExamene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa =new Empresa();
        empresa.pedir();
        empresa.informe();
        System.out.println("Menu más demandado"+ empresa.masDemandado());
    }
    
}
