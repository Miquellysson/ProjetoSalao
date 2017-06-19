package controller;

import model.ModelFormaPagamento;
import DAO.FormaPagamentoDAO;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class FormaPagamento {

    private FormaPagamentoDAO daoFormaPagamento = new FormaPagamentoDAO();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * return int
    */
    public int salvarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.salvarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pCodigo
    * return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(int pCodigo){
        return this.daoFormaPagamento.getFormaPagamentoDAO(pCodigo);
    }
    
    /**
    * recupera FormaPagamento
    * @param pCodigo
    * return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(String pCodigo){
        return this.daoFormaPagamento.getFormaPagamentoDAO(pCodigo);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoController(){
        return this.daoFormaPagamento.getListaFormaPagamentoDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * return boolean
    */
    public boolean atualizarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pCodigo
    * return boolean
    */
    public boolean excluirFormaPagamentoController(int pCodigo){
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pCodigo);
    }
}