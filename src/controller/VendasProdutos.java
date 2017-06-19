package controller;

import model.ModelVendasProdutos;
import DAO.VendasProdutosDAO;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class VendasProdutos {

    private VendasProdutosDAO daoVendasProdutos = new VendasProdutosDAO();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pCodigo
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pCodigo){
        return this.daoVendasProdutos.getVendasProdutosDAO(pCodigo);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pCodigo
    * return boolean
    */
    public boolean excluirVendasProdutosController(int pCodigo){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pCodigo);
    }

    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(int pCodigoVenda) {
        return this.daoVendasProdutos.getListaVendasProdutosDAO(pCodigoVenda);
    }
}