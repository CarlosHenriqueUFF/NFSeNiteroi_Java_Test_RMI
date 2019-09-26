/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webiss.niteroi.nfse.rmi;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import webiss.niteroi.nfse.model.Envio;
import webiss.niteroi.nfse.model.ListaNfseGeradas;
import webiss.niteroi.nfse.model.Venda;

/**
 *
 * @author Carlos Henrique Carvalho da Silva <carlos_henrique@id.uff.br>
 */
public class NFSeTestRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NFSeTestRMI().go();
    }
    
    public void go(){
        try {
            GeradorNfseRemote service = (GeradorNfseRemote) Naming.lookup("rmi://192.168.0.2:1099/RemoteNfse");
            
            Venda venda = new Venda();
            venda.setBairroCliente("Bairro");
            venda.setCelularCliente("999998888");
            venda.setCepCliente("24000000");
            venda.setCidadeCliente("São Gonçalo");
            venda.setCodigoClienteFarmaFacil(2222);
            venda.setCodigoMunicipioCliente(9999999);
            venda.setCodigoTaxaEntrega(101);
            venda.setComplementoCliente("Vila Verde - casa 03");
            venda.setCpfCnpjCliente("11111111111");
            venda.setDataEmissaoVenda(new Date());
            Calendar c = Calendar.getInstance();
            c.add(Calendar.DAY_OF_MONTH, 3);
            venda.setDataPrevisaoEntrega(c.getTime());
            venda.setDddCelularCliente("21");
            venda.setDddTelefoneCliente("21");
            venda.setDiscrimincaoServicos("SHAMPOO SILIMARINA 1000ML 1 UN 129.00 - PAGAMENTO A VISTAS \\s\n");
            venda.setEmailCliente("a@gmail.com");
            venda.setEnderecoCliente("Rua do ouvidor");
            venda.setEstadoCliente("RJ");
            venda.setLocalEntrega("LOJA");
            venda.setNomeCliente("Luana Gomes");
            venda.setNomeVendedor("Guilherme");
            venda.setNumeroEnderecoCliente("545");
            venda.setNumeroVenda(200908);
            venda.setObservacao("Entregar após as 14:00hs");
            venda.setOrcamentoVenda(false);
            venda.setProximidadeCliente("Ao lado do Salão da Majú");
            venda.setTelefoneCliente("34569999");
            venda.setValorAcrescimo(0);
            venda.setValorBruto(187.00);
            venda.setValorDesconto(12.00);
            venda.setValorEntrada(100.00);
            venda.setValorLiquido(175.00);
            venda.setValorTaxaEntrega(5.00);
            
            venda.setSerieRps("1");
            venda.setTipoRps("1");
            venda.setStatusRps(1);
            venda.setExigibilidadeIss(1);
            venda.setAliquota(2.00);
            venda.setItemListaServico("0407");
            venda.setCodigoCnae(4771702);
            venda.setOptanteSimplesNacional(1);
            venda.setInscricaoMunicipalPrestador("9999999");
            venda.setIssRetido(2);
            venda.setCodigoTributacaoMunicipio("0000");
            venda.setTipoDocumentoPrestador("CNPJ");
            venda.setNumeroCnpjCpfPrestador("22222222222222");
            venda.setInscricaoMunicipalCliente(null);
            venda.setCodigoMunicipioServico(9999999);
            venda.setIncentivoFiscal(2);
            venda.setMunicipioIncidencia(9999999);
            
            Venda venda2 = new Venda();
            venda2.setBairroCliente("Coelho");
            venda2.setCelularCliente("977776666");
            venda2.setCepCliente("24230000");
            venda2.setCidadeCliente("São Gonçalo");
            venda2.setCodigoClienteFarmaFacil(888);
            venda2.setCodigoMunicipioCliente(9999999);
            venda2.setCodigoTaxaEntrega(50);
            venda2.setComplementoCliente("APTO 402 BL 01");
            venda2.setCpfCnpjCliente("11111111111");
            venda2.setDataEmissaoVenda(new Date());
            Calendar c2 = Calendar.getInstance();
            c2.add(Calendar.DAY_OF_MONTH, 5);
            venda2.setDataPrevisaoEntrega(c2.getTime());
            venda2.setDddCelularCliente("21");
            venda2.setDddTelefoneCliente("21");
            venda2.setDiscrimincaoServicos("BISCOITO DE BOSHWELLA 90 UNIDADES SABOR CARNE - 230.00");
            venda2.setEmailCliente("b@hotmail.com.br");
            venda2.setEnderecoCliente("Estrada Juvenal de Andrade");
            venda2.setEstadoCliente("RJ");
            venda2.setLocalEntrega("COELHO");
            venda2.setNomeCliente("Tatiana Pires");
            venda2.setNomeVendedor("Rose");
            venda2.setNumeroEnderecoCliente("120");
            venda2.setNumeroVenda(200910);
            venda2.setObservacao("Pagamento em Cheque");
            venda2.setOrcamentoVenda(false);
            venda2.setProximidadeCliente("Ao lado do Posto de Gasolina");
            venda2.setTelefoneCliente("45639000");
            venda2.setValorAcrescimo(0);
            venda2.setValorBruto(230.00);
            venda2.setValorDesconto(0.00);
            venda2.setValorEntrada(0.00);
            venda2.setValorLiquido(230.00);
            venda2.setValorTaxaEntrega(5.00);
            venda2.setSerieRps("1");
            venda2.setTipoRps("1");
            venda2.setStatusRps(1);
            venda2.setExigibilidadeIss(1);
            venda2.setAliquota(2.00);
            venda2.setItemListaServico("0407");
            venda2.setCodigoCnae(4771702);
            venda2.setOptanteSimplesNacional(1);
            venda2.setInscricaoMunicipalPrestador("9999999");
            venda2.setIssRetido(2);
            venda2.setCodigoTributacaoMunicipio("0407");
            venda2.setTipoDocumentoPrestador("CNPJ");
            venda2.setNumeroCnpjCpfPrestador("22222222222222");
            venda2.setInscricaoMunicipalCliente(null);
            venda2.setCodigoMunicipioServico(9999999);
            venda2.setIncentivoFiscal(2);
            venda2.setMunicipioIncidencia(9999999);
            
            List<Venda> vendas = new ArrayList<>();
            vendas.add(venda);
            vendas.add(venda2);
            
            //ListaNfseGeradas listaNfse = service.gerarNotaFiscal(venda);
            ListaNfseGeradas listaNfse = service.gerarNotaFiscalEmLote(vendas);
            if (listaNfse.getMensagemErro() != null){
                System.out.println("ERROR:");
                System.out.println(listaNfse.getMensagemErro());
            } else if (listaNfse.getListNfse() != null){
                for (Envio envio : listaNfse.getListNfse()){
                    System.out.println("************* NFSe salva com sucesso!!! ********************");
                    envio.print();
                }
            } else {
                System.out.println("Nenhum dado no objeto de retorno");
            }
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(GeradorNfseRemote.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
