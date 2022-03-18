/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author xXSorzXx
 */
public class Programmer extends Employee{
    String languaje;
    
    public void printData(String languaje){
        printData();
        System.out.println("Languaje: " + languaje);
    }
}
