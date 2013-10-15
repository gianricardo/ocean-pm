/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package versoes;

/**
 *
 * @author gui
 */
public class ComunicacaoVersoesImpl implements ComunicacaoVersoes{
    
    private DadosExternosFacade conexao;
    
    @Override
    public Versoes[] retornaVersoes() {
       return conexao.retornaVersoes();
    }

    @Override
    public float versaoAtual() {
        return conexao.versaoAtual();
        
    }

    @Override
    public Versoes dadosVersao(float num_versao) {
        return conexao.dadosversao(num_versao);
    }
    
}
