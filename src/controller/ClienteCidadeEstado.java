package controller;

import DAO.ClienteCidadeEstadoDAO;
import java.util.ArrayList;
import model.ModelClienteCidadeEstado;
/**
 *
 * @author Mike
 */
public class ClienteCidadeEstado {

    private ClienteCidadeEstadoDAO dAOClienteCidadeEstado = new ClienteCidadeEstadoDAO();

    /**
    * recupera uma lista deCidadeEstado
    * @param pModelCidade
    * return ArrayList
    */
    public ArrayList<ModelClienteCidadeEstado> getListaClienteCidadeEstadoController(){
        return this.dAOClienteCidadeEstado.getListaClienteCidadeEstadoDAO();
    }
}