/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorios;

import DAO.ConexaoDAO;
import java.awt.Desktop;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Mike
 */
public class DAORelatorios extends ConexaoDAO {



    public boolean gerarRelatorioVenda(int pCodigo) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "     vendas.CODIGO AS vendas_CODIGO, "
                    + "     vendas.CLIENTES_CODIGO AS vendas_CLIENTES_CODIGO, "
                    + "     vendas.DATA_VENDA AS vendas_DATA_VENDA, "
                    + "     vendas.VALOR_TOTAL AS vendas_VALOR_TOTAL, "
                    + "     vendas.DESCONTO AS vendas_DESCONTO, "
                    + "     vendas_produto.QUANTIDADE AS vendas_produto_QUANTIDADE, "
                    + "     produtos.CODIGO AS produtos_CODIGO, "
                    + "     produtos.NOME AS produtos_NOME, "
                    + "     produtos.VALOR AS produtos_VALOR, "
                    + "     clientes.CODIGO AS clientes_CODIGO, "
                    + "     clientes.NOME AS clientes_NOME, "
                    + "     clientes.ENDERECO AS clientes_ENDERECO, "
                    + "     clientes.BAIRRO AS clientes_BAIRRO, "
                    + "     clientes.CEP AS clientes_CEP, "
                    + "     clientes.TELEFONE AS clientes_TELEFONE, "
                    + "     cidade.nome AS cidade_nome, "
                    + "     estado.uf AS estado_uf, "
                    + "     unidade_medida.abreviacao AS unidade_medida_abreviacao, "
                    + "     vendas.OBSERVACAO AS vendas_OBSERVACAO, "
                    + "     clientes.CPF_CNPJ AS clientes_CPF_CNPJ, "
                    + "     clientes.OBSERVACAO AS clientes_OBSERVACAO, "
                    + "     forma_pagamento.descricao AS forma_pagamento_descricao, "
                    + "     fornecedores.NOME AS fornecedores_NOME, "
                    + "     vendas_produto.`VALOR_UNITARIO` AS vendas_produto_VALOR_UNITARIO "
                    + " FROM "
                    + "     vendas vendas INNER JOIN vendas_produto vendas_produto ON vendas.CODIGO = vendas_produto.CODIGO_VENDA "
                    + "     INNER JOIN produtos produtos ON vendas_produto.CODIGO_PRODUTO = produtos.CODIGO "
                    + "     INNER JOIN unidade_medida unidade_medida ON produtos.UNIDADE_MEDIDA = unidade_medida.codigo "
                    + "     INNER JOIN fornecedores fornecedores ON produtos.FORNECEDORES_CODIGO = fornecedores.CODIGO "
                    + "     INNER JOIN clientes clientes ON vendas.CLIENTES_CODIGO = clientes.CODIGO "
                    + "     INNER JOIN forma_pagamento forma_pagamento ON vendas.TIPO_PAGAMENTO = forma_pagamento.codigo "
                    + "     INNER JOIN estado estado ON clientes.COD_ESTADO = estado.codigo "
                    + "     INNER JOIN cidade cidade ON clientes.COD_CIDADE = cidade.codigo "
                    + "     AND estado.codigo = cidade.fk_cod_estado where VENDAS.CODIGO = '" + pCodigo + "'");
            JRResultSetDataSource jrRS = new JRResultSetDataSource(getResultSet());
            // caminho do arquivo dentro dos pacotes  
            InputStream caminhoRelatorio = this.getClass().getClassLoader().getResourceAsStream("ArquivosJasper/relatorioVendas.jasper");
            JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoRelatorio, new HashMap(), jrRS);

            String nomeArquivo = "C:/PROJETO-SALAO/rel.pdf";
            JasperExportManager.exportReportToPdfFile(jasperPrint, nomeArquivo);
            File file = new File(nomeArquivo);
            try {
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
            file.deleteOnExit();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    }
    

