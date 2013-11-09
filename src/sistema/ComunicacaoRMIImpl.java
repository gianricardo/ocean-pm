/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import Riscos.ComunicacaoRiscos;
import Riscos.Riscos;
import com.taskadapter.redmineapi.RedmineException;
import especificacao.ComunicacaoEspecificacao;
import especificacao.Documento;
import javax.rmi.PortableRemoteObject;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto.ComunicacaoProjetoImpl;
import projeto.Projeto;
import projeto.QuantAtividades;
import testes.ComunicacaoTestes;
import testes.Teste;
import versoes.ComunicacaoVersoes;
import versoes.Versoes;
/**
 *
 * @author gui
 */
public class ComunicacaoRMIImpl extends UnicastRemoteObject implements ComunicacaoRMI {
    
    private ComunicacaoProjetoImpl comunicacao_projeto;
    private ComunicacaoRiscos comunicacao_riscos;
    private ComunicacaoEspecificacao comunicacao_especificacao;
    private ComunicacaoTestes comunicacao_testes;
    private ComunicacaoVersoes comunicacao_versoes;
    private static int VerificaDisp;
    
    
    public ComunicacaoRMIImpl() throws RemoteException{ super();}
          
    public Projeto retornaProjeto(String nome) throws RemoteException{
        comunicacao_projeto = new ComunicacaoProjetoImpl();
        Projeto projeto = new Projeto();
         VerificaDisp = 0;
        VerificaDisp = comunicacao_projeto.VerificaDisp();
        if(VerificaDisp == 1){
            System.out.println("Conexão com o Projeto ok");
        }else{
            System.out.println("Problema na conexão com o Projeto");
            return null;
        }
        
        projeto = comunicacao_projeto.RetornaProjeto(nome);
        return projeto;
    }
         
    public Riscos[] retornaRiscos()throws RemoteException {
        VerificaDisp = 0;
        VerificaDisp = comunicacao_riscos.verificarDisp();
        if(VerificaDisp == 1){
            return comunicacao_riscos.retornaRiscos();
        }else{
            return null;
        }
        
    }
    
   public Documento retornaDocumento(String nome)throws RemoteException{
       VerificaDisp = 0;
        VerificaDisp = comunicacao_especificacao.VerificaDisp();
        if(VerificaDisp == 1){
            return comunicacao_especificacao.retornaDocumento(nome);
        }else{
            return null;
        }
       
   }
   
   public String ListaDocumentosDisp()throws RemoteException{
       VerificaDisp = 0;
        VerificaDisp = comunicacao_especificacao.VerificaDisp();
        if(VerificaDisp == 1){
            return comunicacao_especificacao.ListaDocumentosDisp();
        }else{
            return null;
        }
       
   }
   
   public Teste[] retornaDadosTestes()throws RemoteException{
       VerificaDisp = 0;
        VerificaDisp = comunicacao_testes.verificarDisp();
        if(VerificaDisp == 1){
            return comunicacao_testes.retornaDadosTestes();
        }else{
            return null;
        }
       
   }
   
   public Versoes[] retornaVersoes()throws RemoteException{
       VerificaDisp = 0;
        VerificaDisp = comunicacao_versoes.VerificaDisp();
        if(VerificaDisp == 1){
            return comunicacao_versoes.retornaVersoes();
        }else{
            return null;
        }
       
   }
   
    public float versaoAtual()throws RemoteException{
        VerificaDisp = 0;
        VerificaDisp = comunicacao_versoes.VerificaDisp();
        if(VerificaDisp == 1){
            return comunicacao_versoes.versaoAtual();
        }else{
            return -1;
        }
        
    }
    
    public Versoes dadosVersao(float num_versao)throws RemoteException{
        VerificaDisp = 0;
        VerificaDisp = comunicacao_versoes.VerificaDisp();
        if(VerificaDisp == 1){
            return comunicacao_versoes.dadosVersao(num_versao);
        }else{
            return null;
        }
        
    }
    
    @Override
    public float tempoEstimadoProjeto(String nome) throws RemoteException{
        return comunicacao_projeto.tempoEstimadoProjeto(nome);
    }
        
        
    
    
    @Override
   public float tempoGastoProjeto(String nome) throws RemoteException{
       return comunicacao_projeto.tempoEstimadoProjeto(nome);
       
   }
    
   public int totalAtividades(String nome) throws RemoteException{
       return comunicacao_projeto.totalAtividades(nome);
   }
   
   public int[] quatidadeDeAtividadesPorPrioridade(String nome) throws RemoteException{
       return comunicacao_projeto.quatidadeDeAtividadesPorPrioridade(nome);
   }
   
   public int[] quantidadeDeAtividadesPorStatus(String nome) throws RemoteException{
       return comunicacao_projeto.quantidadeDeAtividadesPorStatus(nome);
   }
    
}
