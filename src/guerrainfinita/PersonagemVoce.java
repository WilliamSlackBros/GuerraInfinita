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
public class PersonagemVoce extends Personagem{
    private String ferramenta;
    public PersonagemVoce(String nm_personagem, Integer qtdade_poder, Integer vida,String ferr) {
        super(nm_personagem, qtdade_poder, vida);
        this.ferramenta=ferr;
    }
    
    
}
