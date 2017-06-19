package controller;

import DAO.FornecedorCidadeEstadoDAO;
import java.util.ArrayList;
import model.ModelFornecedorCidadeEstado;

/**
 *
 * @author Mike
 */
public class FornecedorCidadeEstado {

    private FornecedorCidadeEstadoDAO dAOFornecedorCidadeEstado = new FornecedorCidadeEstadoDAO();

    /**
    * recupera uma lista de fornecedores estado cidade
    * @param
    * return ArrayList
    */
    public ArrayList<ModelFornecedorCidadeEstado> getlistaFornecedorCidadeEstados(){
        return this.dAOFornecedorCidadeEstado.getListaFornecedorCidadeEstadoDAO();
    }
}