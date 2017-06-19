package controller;

import model.ModelFornecedor;
import DAO.FornecedorDAO;
import java.util.ArrayList;
import relatorios.DAORelatorios;

/**
 *
 * @author Mike
 */
public class Fornecedor {

    private FornecedorDAO daoFornecedor = new FornecedorDAO();
    private DAORelatorios dAORelatorios = new DAORelatorios();

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.salvarFornecedorDAO(pModelFornecedor);
    }

    /**
    * recupera Fornecedor
    * @param pCodigo
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(int pCodigo){
        return this.daoFornecedor.getFornecedorDAO(pCodigo);
    }
    
    /**
    * recupera Fornecedor
    * @param pNome
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorController(String pNome){
        return this.daoFornecedor.getFornecedorDAO(pNome);
    }
    
    /**
    * recupera Fornecedor
    * @param pNome
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorProdutoController(int pCodigoProduto){
        return this.daoFornecedor.getFornecedorProdutoDAO(pCodigoProduto);
    }

    /**
    * recupera uma lista deFornecedor
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorController(){
        return this.daoFornecedor.getListaFornecedorDAO();
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorController(ModelFornecedor pModelFornecedor){
        return this.daoFornecedor.atualizarFornecedorDAO(pModelFornecedor);
    }

    /**
    * exclui Fornecedor
    * @param pCodigo
    * return boolean
    */
    public boolean excluirFornecedorController(int pCodigo){
        return this.daoFornecedor.excluirFornecedorDAO(pCodigo);
    }

   
}