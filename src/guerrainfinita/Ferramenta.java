/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerrainfinita;

/**
 *
 * @author jango
 */
public class Ferramenta {
    private  String nm_ferramenta;
    private  Integer qtdade_disponivel;
    private  Integer qtdade_usada;
    private  Integer forca;

    public Ferramenta(String nm_ferramenta, Integer qtdade_disponivel, Integer qtdade_usada, Integer forca) {
        this.nm_ferramenta = nm_ferramenta;
        this.qtdade_disponivel = qtdade_disponivel;
        this.qtdade_usada = qtdade_usada;
        this.forca = forca;
    }
  
    
  
}
