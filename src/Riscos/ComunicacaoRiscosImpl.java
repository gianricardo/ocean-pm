/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Riscos;

/**
 *
 * @author gui
 */
public class ComunicacaoRiscosImpl implements ComunicacaoRiscos{
    private DadosExternosFacade conexao;
    
    @Override
    public int verificarDisp() {
        return conexao.verificaDisp();
        
        
    }

    @Override
    public Riscos[] retornaRiscos() {
        return conexao.retornaRiscos();
        
    }
    
}
