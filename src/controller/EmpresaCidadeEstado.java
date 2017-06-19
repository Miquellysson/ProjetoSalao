package controller;

import model.ModelEmpresaCidadeEstado;
import DAO.EmpresaCidadeEstadoDAO;
import java.util.ArrayList;
import model.ModelCidade;

/**
 *
 * @author Mike
 */
public class EmpresaCidadeEstado {

    private EmpresaCidadeEstadoDAO daoEmpresaCidadeEstado = new EmpresaCidadeEstadoDAO();

    /**
    * recupera EmpresaCidadeEstado
    * @param pModelCidade
    * return ModelEmpresaCidadeEstado
    */
    public ModelEmpresaCidadeEstado getEmpresaCidadeEstadoController(int pCodigo){
        return this.daoEmpresaCidadeEstado.getEmpresaCidadeEstadoDAO(pCodigo);
    }

    /**
    * recupera uma lista deEmpresaCidadeEstado
    * @param pModelCidade
    * return ArrayList
    */
    public ArrayList<ModelEmpresaCidadeEstado> getListaEmpresaCidadeEstadoController(){
        return this.daoEmpresaCidadeEstado.getListaEmpresaCidadeEstadoDAO();
    }
}