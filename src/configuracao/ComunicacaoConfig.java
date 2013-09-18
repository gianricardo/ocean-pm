/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package configuracao;

/**
 *
 * @author gui
 */
public interface ComunicacaoConfig {
    
    public int AtivarAlerta();
    public int DesativarAlerta();
    public int ConfigurarAlerta(String configuracao);
    public void RetornaAlertas();
    public void AdicionarAlerta();
    public void RemoverAlerta();
    public void AlterarTempoAtualizaDados();
    
    
}
