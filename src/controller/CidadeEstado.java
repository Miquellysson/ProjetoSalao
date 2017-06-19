package controller;

import model.ModelCidadeEstado;
import DAO.CidadeEstadoDAO;
import java.util.ArrayList;
import model.ModelCidade;

/**
 *
 * @author Mike
 */
public class CidadeEstado {

    private CidadeEstadoDAO daoCidadeEstado = new CidadeEstadoDAO();

    /**
    * recupera uma lista deCidadeEstado
    * @param pModelCidade
    * return ArrayList
    */
    public ArrayList<ModelCidadeEstado> getListaCidadeEstadoController(){
        return this.daoCidadeEstado.getListaCidadeEstadoDAO();
    }
}