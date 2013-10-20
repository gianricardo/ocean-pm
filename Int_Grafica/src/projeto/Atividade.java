/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;

/**
 *
 * @author gui
 */
public class Atividade implements Serializable{
    
    private static String nome;
    private static Date data_inicio;
    private static Date data_fim;
    private static Membro_equipe responsavel;
    private static Array colaboradores;
    private static String status;
    private static String descricao;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String aNome) {
        nome = aNome;
    }

    public static Date getData_inicio() {
        return data_inicio;
    }

    public static void setData_inicio(Date aData_inicio) {
        data_inicio = aData_inicio;
    }

    public static Date getData_fim() {
        return data_fim;
    }

    public static void setData_fim(Date aData_fim) {
        data_fim = aData_fim;
    }

    public static Membro_equipe getResponsavel() {
        return responsavel;
    }

    public static void setResponsavel(Membro_equipe aResponsavel) {
        responsavel = aResponsavel;
    }

    public static Array getColaboradores() {
        return colaboradores;
    }

    public static void setColaboradores(Array aColaboradores) {
        colaboradores = aColaboradores;
    }

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String aStatus) {
        status = aStatus;
    }

    public static String getDescricao() {
        return descricao;
    }

    public static void setDescricao(String aDescricao) {
        descricao = aDescricao;
    }
    
}
