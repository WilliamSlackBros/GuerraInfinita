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
public class JoiaRealidade extends Joia{
     private String regra;

    public JoiaRealidade(String nm_joia, String cor, Integer qtdade_poder,String regra) {
        super(nm_joia, cor, qtdade_poder);
           this.regra = regra;
    }

    public String getRegra() {
        return "Para conseguir: "+regra;
    }
    public String getnome(){
        return "Seu Nome: "+super.getNmJoia();
    }
     @Override
    public String getCor(){
        return "Sua cor: "+super.getCor();
    }
    public Integer getPoder(){
        return super.getQtdadePoder();
    }
     
}
