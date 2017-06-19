package controller;

import model.ModelProdutos;
import DAO.ProdutosDAO;
import java.util.ArrayList;
import relatorios.DAORelatorios;

/**
 *
 * @author Mike
 */
public class Produtos {

    private ProdutosDAO daoProdutos = new ProdutosDAO();
    private DAORelatorios dAORelatorios = new DAORelatorios();
    /**
    * grava Produtos
    * @param pModelProdutos
    * return int
    */
    public int salvarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    /**
    * recupera Produtos
    * @param pCodigo
    * return ModelProdutos
    */
    public ModelProdutos getProdutosController(int pCodigo){
        return this.daoProdutos.getProdutosDAO(pCodigo);
    }
    
    /**
    * recupera Produtos
    * @param pNome
    * return ModelProdutos
    */
    public ModelProdutos getProdutosController(String pNome){
        return this.daoProdutos.getProdutosDAO(pNome);
    }

    /**
    * recupera uma lista deProdutos
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelProdutos> getListaProdutosController(){
        return this.daoProdutos.getListaProdutosDAO();
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosController(ModelProdutos pModelProdutos){
        return this.daoProdutos.atualizarProdutosDAO(pModelProdutos);
    }

    /**
    * exclui Produtos
    * @param pCodigo
    * return boolean
    */
    public boolean excluirProdutosController(int pCodigo){
        return this.daoProdutos.excluirProdutosDAO(pCodigo);
    }

    /**
    * atualiza Produtos
    * @param pModelProdutos
    * return boolean
    */
    public boolean atualizarProdutosQuantidadeController(ModelProdutos pModelProdutos){
        return this.daoProdutos.atualizarProdutosQuantidadeDAO(pModelProdutos);
    }
    
    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeUmController(int pcodigo, float pQuantidade) {
        return this.daoProdutos.atualizarProdutosQuantidadeUmDAO(pcodigo, pQuantidade);
    }
    

 

    
}