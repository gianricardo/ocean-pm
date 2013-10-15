/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package requisitos;

/**
 *
 * @author gui
 */
public class ComunicacaoRequisitosImpl implements ComunicacaoRequisitos{

    private DadosExternosFacade conexao;
    
    @Override
    public int verificarDisp() {
        return conexao.verificarDisp();
        
    }

    @Override
    public Requisito[] retornaRequistos() {
        return conexao.retornarRequisitos();
        
    }
    
}
