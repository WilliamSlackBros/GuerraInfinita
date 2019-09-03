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
public class Joia {
    private String nmjoia;
    private String cor;
    private Integer qtdade_poder;

    public Joia(String nm_joia, String cor, Integer qtdade_poder) {
        this.nmjoia = nm_joia;
        this.cor = cor;
        this.qtdade_poder = qtdade_poder;
    }

    public String getNmJoia() {
        return nmjoia;
    }

    public String getCor() {
        return cor;
    }

    public Integer getQtdadePoder() {
        return qtdade_poder;
    }
    

}
