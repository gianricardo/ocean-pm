/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package especificacao;

/**
 *
 * @author gui
 */
public class ComunicacaoEspecificacaoImpl implements ComunicacaoEspecificacao{
    private DadosExternosFacade conexao;
    
    @Override
    public int VerificaDisp() {
        return conexao.VerificaDisp();
    }

    @Override
    public Documento retornaDocumento(String nome) {
        return conexao.retornaDocumento(nome);
    }

    @Override
    public String ListaDocumentosDisp() {
        return conexao.ListaDocumentosDisp();
    }
    
}
