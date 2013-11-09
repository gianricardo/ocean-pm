/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import com.taskadapter.redmineapi.RedmineException;
import java.util.ArrayList;

/**
 *
 * @author gui
 */
public interface ComunicacaoProjeto {
    
    public int VerificaDisp();
    public Projeto RetornaProjeto(String nome);
    public float tempoEstimadoProjeto(String nome);
    public float tempoDecorridoProjeto(String nome);
    public int totalAtividades(String nome);
    public int[] quatidadeDeAtividadesPorPrioridade(String nome);
    public int[] quantidadeDeAtividadesPorStatus(String nome);
    
}
