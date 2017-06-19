package controller;

import model.ModelCaixa;
import DAO.CaixaDAO;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class Caixa {

    private CaixaDAO daoCaixa = new CaixaDAO();

    /**
    * grava Caixa
    * @param pModelCaixa
    * return int
    */
    public int salvarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }

    /**
    * recupera Caixa
    * @param pCodigo
    * return ModelCaixa
    */
    public ModelCaixa getCaixaController(int pCodigo){
        return this.daoCaixa.getCaixaDAO(pCodigo);
    }

    /**
    * recupera uma lista deCaixa
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelCaixa> getListaCaixaController(){
        return this.daoCaixa.getListaCaixaDAO();
    }

    /**
    * atualiza Caixa
    * @param pModelCaixa
    * return boolean
    */
    public boolean atualizarCaixaController(ModelCaixa pModelCaixa){
        return this.daoCaixa.atualizarCaixaDAO(pModelCaixa);
    }

    /**
    * exclui Caixa
    * @param pCodigo
    * return boolean
    */
    public boolean excluirCaixaController(int pCodigo){
        return this.daoCaixa.excluirCaixaDAO(pCodigo);
    }
}