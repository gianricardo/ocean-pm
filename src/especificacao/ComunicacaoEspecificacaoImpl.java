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
        return conexao.VerificarDisponibilidade();
    }

    @Override
    public Documento retornaDocumento(String nome_projeto, String nome_documento) {
        return conexao.retornaDocumento(nome_projeto, nome_documento);
    }

    @Override
    public String ListaDocumentosDisp() {
        return conexao.ListaDocumentosDisp();
    }
    
}
