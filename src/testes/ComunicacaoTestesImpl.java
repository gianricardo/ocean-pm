/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author gui
 */
public class ComunicacaoTestesImpl implements ComunicacaoTestes{
    
    private DadosExternosFacade conexao;

    @Override
    public int verificarDisp() {
       return conexao.verificaDisp();
    }

    @Override
    public Teste[] retornaDadosTestes() {
       return conexao.retornaTestes();
    }
    
}
