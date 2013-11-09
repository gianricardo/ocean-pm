/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;

/**
 *
 * @author gui
 */
public class QuantAtividades implements Serializable{
    
    private int item;
    
    public QuantAtividades(){
        item = 0;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

   
    
}
