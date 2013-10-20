/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package versoes;

/**
 *
 * @author gui
 */
public interface ComunicacaoVersoes {
    
    public Versoes[] retornaVersoes();
    public float versaoAtual();
    public Versoes dadosVersao(float num_versao);
    public int VerificaDisp();
    
}
