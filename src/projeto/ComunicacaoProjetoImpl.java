/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;


public class ComunicacaoProjetoImpl implements ComunicacaoProjeto {
    private DadosExternosFacade conexao;
    
    @Override
    public int VerificaDisp() {
        conexao = new DadosExternosFacade();
       return  conexao.VerificarDisponibilidade();
    }

    @Override
    public Projeto RetornaProjeto(String nome) {
        Projeto proj = new Projeto();
        proj = conexao.RetornaProjeto(nome);
        
        return proj;
        
    }

    @Override
    public Atividade[] RetornaAtividades() {
        return null;
    }
    
}
