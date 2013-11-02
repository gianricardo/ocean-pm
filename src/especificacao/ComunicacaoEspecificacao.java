/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package especificacao;

/**
 *
 * @author gui
 */
public interface ComunicacaoEspecificacao {
    
    public int VerificaDisp();
    public Documento retornaDocumento(String nome_projeto, String nome_documento);
    public String ListaDocumentosDisp();
    
    
}
