package controller;

import model.ModelUnidadeMedia;
import DAO.UnidadeMediaDAO;
import java.util.ArrayList;

/**
 *
 * @author Mike
 */
public class UnidadeMedia {

    private UnidadeMediaDAO daoUnidadeMedia = new UnidadeMediaDAO();

    /**
    * grava UnidadeMedia
    * @param pModelUnidadeMedia
    * return int
    */
    public int salvarUnidadeMediaController(ModelUnidadeMedia pModelUnidadeMedia){
        return this.daoUnidadeMedia.salvarUnidadeMediaDAO(pModelUnidadeMedia);
    }

    /**
    * recupera UnidadeMedia
    * @param pCodigo
    * return ModelUnidadeMedia
    */
    public ModelUnidadeMedia getUnidadeMediaController(int pCodigo){
        return this.daoUnidadeMedia.getUnidadeMediaDAO(pCodigo);
    }
    
    /**
    * recupera UnidadeMedia
    * @param pCodigo
    * return ModelUnidadeMedia
    */
    public ModelUnidadeMedia getUnidadeMediaController(String pNome){
        return this.daoUnidadeMedia.getUnidadeMediaDAO(pNome);
    }

    /**
    * recupera uma lista deUnidadeMedia
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelUnidadeMedia> getListaUnidadeMediaController(){
        return this.daoUnidadeMedia.getListaUnidadeMediaDAO();
    }

    /**
    * atualiza UnidadeMedia
    * @param pModelUnidadeMedia
    * return boolean
    */
    public boolean atualizarUnidadeMediaController(ModelUnidadeMedia pModelUnidadeMedia){
        return this.daoUnidadeMedia.atualizarUnidadeMediaDAO(pModelUnidadeMedia);
    }

    /**
    * exclui UnidadeMedia
    * @param pCodigo
    * return boolean
    */
    public boolean excluirUnidadeMediaController(int pCodigo){
        return this.daoUnidadeMedia.excluirUnidadeMediaDAO(pCodigo);
    }
}