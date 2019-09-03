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
public class Play {
    private String pergunta;
    private String[] opcao;
    private String resposta;
    private String vencedor;

    public Play(String pergunta, String[] opcao) {
        this.pergunta = pergunta;
        this.opcao = opcao;
    }
  
public String getPergResp(){
    String PergResp = null;
    PergResp=this.pergunta;
    for (Object e : this.opcao) {
        PergResp+="\n "+e;
    }
    return PergResp;
}

public setResposta(String resposta){
    this.resposta=resposta;
}
    
    
}
