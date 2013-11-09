/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Riscos.Riscos;
import especificacao.Documento;
import java.rmi.*;
import java.util.ArrayList;
import projeto.Atividade;
import projeto.Projeto;
import projeto.QuantAtividades;
import testes.Teste;
import versoes.Versoes;

/**
 *
 * @author gui
 */
public interface ComunicacaoRMI extends Remote{
    
    
   public Projeto retornaProjeto(String nome) throws RemoteException;
   public Riscos[] retornaRiscos()throws RemoteException;
   public Documento retornaDocumento(String nome)throws RemoteException;
   public String ListaDocumentosDisp()throws RemoteException;
   public Teste[] retornaDadosTestes()throws RemoteException;
   public Versoes[] retornaVersoes()throws RemoteException;
   public float versaoAtual()throws RemoteException;
   public Versoes dadosVersao(float num_versao)throws RemoteException;
   public float tempoEstimadoProjeto(String nome) throws RemoteException;
   public float tempoGastoProjeto(String nome) throws RemoteException;
   public int totalAtividades(String nome) throws RemoteException;
   public int[] quatidadeDeAtividadesPorPrioridade(String nome) throws RemoteException;
   public int[] quantidadeDeAtividadesPorStatus(String nome) throws RemoteException;
   
}
