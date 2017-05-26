/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Sebastian
 */
public class Punto21b {
    public static void main(String[] args) {
        try{
            for(int i=0;i<2;i++){
                System.out.print(i+" ");
                System.out.println(1/0);
            }
        }
        catch (Exception ex){
            
        }
    }
}
