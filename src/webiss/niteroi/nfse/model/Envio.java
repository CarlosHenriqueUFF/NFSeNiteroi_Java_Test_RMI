/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webiss.niteroi.nfse.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Carlos Henrique Carvalho da Silva <carlos_henrique@id.uff.br>
 */
public class Envio implements Serializable {

    private Long numeroRps;
    private String serieRps;
    private String tipoRps;
    private Date dataEmissaoRps;
    private Integer statusRps;
    private Date dataCompetenciaRps;
    private Double valorServicos;
    private Double valorDeducoes;
    private Double valorPis;
    private Double valorCofins;
    private Double valorInss;
    private Double valorIr;
    private Double valorCsll;
    private Double outrasRetencoes;
    private Double valorIss;
    private Double aliquota;
    private Double descontoIncondicionado;
    private Double descontoCondicionado;
    private Integer issRetido;
    private Integer responsavelRetencao;
    private String itemListaServico;
    private Integer codigoCnae;
    private String codigoTributacaoMunicipio;
    private String discriminacaoServico;
    private Integer codigoMunicipioServico;
    private String codigoPais;
    private Integer exigibilidadeIss;
    private Integer municipioIncidencia;
    private String numeroProcesso;
    private String tipoDocumentoPrestador;
    private String numeroCnpjCpfPrestador;
    private String inscricaoMunicipalPrestador;
    private String tipoDocumentoTomador;
    private String numeroCnpjCpfTomador;
    private String inscricaoMunicipalTomador;
    private String razaoSocialTomador;
    private String enderecoTomador;
    private String numeroEnderecoTomador;
    private String complementoEnderecoTomador;
    private String bairroTomador;
    private Integer codigoMunicipioTomador;
    private String ufTomador;
    private Integer codigoPaisTomador;
    private String cepTomador;
    private String telefoneTomador;
    private String emailTomador;
    private String codigoObra;
    private String artObra;
    private Integer regimeEspecialTributacao;
    private Integer optanteSimplesNacional;
    private Integer incentivoFiscal;
    private Integer isEnviada;
    private String numeroNfse;
    private Integer isProblematica;
    private String usuarioInsercao;
    private Date dataInsercao;
    private String usuarioAlteracao;
    private Date dataAlteracao;
    private String xmlEnvio;
    private String xmlRetorno;
    private Integer numeroLote;
    private Integer numeroVenda;
    private String codigoVerificacaoNfse;
    private Date dataEmissaoNfse;
    private String outrasInformacoesNfse;
    private Double baseCalculoNfse;
    private Double valorLiquidoNfse;
    private Double valorCreditoNfse;
    private Integer codigoMunicipioGeradorNfse;
    private String ufOrgaoGeradorNfse;
    
    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public Long getNumeroRps() {
        return numeroRps;
    }

    public void setNumeroRps(Long numeroRps) {
        this.numeroRps = numeroRps;
    }

    public String getSerieRps() {
        return serieRps;
    }

    public void setSerieRps(String serieRps) {
        this.serieRps = serieRps;
    }

    public String getTipoRps() {
        return tipoRps;
    }

    public void setTipoRps(String tipoRps) {
        this.tipoRps = tipoRps;
    }

    public Date getDataEmissaoRps() {
        return dataEmissaoRps;
    }

    public void setDataEmissaoRps(Date dataEmissaoRps) {
        this.dataEmissaoRps = dataEmissaoRps;
    }

    public Integer getStatusRps() {
        return statusRps;
    }

    public void setStatusRps(Integer statusRps) {
        this.statusRps = statusRps;
    }

    public Date getDataCompetenciaRps() {
        return dataCompetenciaRps;
    }

    public void setDataCompetenciaRps(Date dataCompetenciaRps) {
        this.dataCompetenciaRps = dataCompetenciaRps;
    }

    public Double getValorServicos() {
        return valorServicos;
    }

    public void setValorServicos(Double valorServicos) {
        this.valorServicos = valorServicos;
    }

    public Double getValorDeducoes() {
        return valorDeducoes;
    }

    public void setValorDeducoes(Double valorDeducoes) {
        this.valorDeducoes = valorDeducoes;
    }

    public Double getValorPis() {
        return valorPis;
    }

    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
    }

    public Double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
    }

    public Double getValorInss() {
        return valorInss;
    }

    public void setValorInss(Double valorInss) {
        this.valorInss = valorInss;
    }

    public Double getValorIr() {
        return valorIr;
    }

    public void setValorIr(Double valorIr) {
        this.valorIr = valorIr;
    }

    public Double getValorCsll() {
        return valorCsll;
    }

    public void setValorCsll(Double valorCsll) {
        this.valorCsll = valorCsll;
    }

    public Double getOutrasRetencoes() {
        return outrasRetencoes;
    }

    public void setOutrasRetencoes(Double outrasRetencoes) {
        this.outrasRetencoes = outrasRetencoes;
    }

    public Double getValorIss() {
        return valorIss;
    }

    public void setValorIss(Double valorIss) {
        this.valorIss = valorIss;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getDescontoIncondicionado() {
        return descontoIncondicionado;
    }

    public void setDescontoIncondicionado(Double descontoIncondicionado) {
        this.descontoIncondicionado = descontoIncondicionado;
    }

    public Double getDescontoCondicionado() {
        return descontoCondicionado;
    }

    public void setDescontoCondicionado(Double descontoCondicionado) {
        this.descontoCondicionado = descontoCondicionado;
    }

    public Integer getIssRetido() {
        return issRetido;
    }

    public void setIssRetido(Integer issRetido) {
        this.issRetido = issRetido;
    }

    public Integer getResponsavelRetencao() {
        return responsavelRetencao;
    }

    public void setResponsavelRetencao(Integer responsavelRetencao) {
        this.responsavelRetencao = responsavelRetencao;
    }

    public String getItemListaServico() {
        return itemListaServico;
    }

    public void setItemListaServico(String itemListaServico) {
        this.itemListaServico = itemListaServico;
    }

    public Integer getCodigoCnae() {
        return codigoCnae;
    }

    public void setCodigoCnae(Integer codigoCnae) {
        this.codigoCnae = codigoCnae;
    }

    public String getCodigoTributacaoMunicipio() {
        return codigoTributacaoMunicipio;
    }

    public void setCodigoTributacaoMunicipio(String codigoTributacaoMunicipio) {
        this.codigoTributacaoMunicipio = codigoTributacaoMunicipio;
    }

    public String getDiscriminacaoServico() {
        return discriminacaoServico;
    }

    public void setDiscriminacaoServico(String discriminacaoServico) {
        this.discriminacaoServico = discriminacaoServico;
    }

    public Integer getCodigoMunicipioServico() {
        return codigoMunicipioServico;
    }

    public void setCodigoMunicipioServico(Integer codigoMunicipioServico) {
        this.codigoMunicipioServico = codigoMunicipioServico;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Integer getExigibilidadeIss() {
        return exigibilidadeIss;
    }

    public void setExigibilidadeIss(Integer exigibilidadeIss) {
        this.exigibilidadeIss = exigibilidadeIss;
    }

    public Integer getMunicipioIncidencia() {
        return municipioIncidencia;
    }

    public void setMunicipioIncidencia(Integer municipioIncidencia) {
        this.municipioIncidencia = municipioIncidencia;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getTipoDocumentoPrestador() {
        return tipoDocumentoPrestador;
    }

    public void setTipoDocumentoPrestador(String tipoDocumentoPrestador) {
        this.tipoDocumentoPrestador = tipoDocumentoPrestador;
    }

    public String getNumeroCnpjCpfPrestador() {
        return numeroCnpjCpfPrestador;
    }

    public void setNumeroCnpjCpfPrestador(String numeroCnpjCpfPrestador) {
        this.numeroCnpjCpfPrestador = numeroCnpjCpfPrestador;
    }

    public String getInscricaoMunicipalPrestador() {
        return inscricaoMunicipalPrestador;
    }

    public void setInscricaoMunicipalPrestador(String inscricaoMunicipalPrestador) {
        this.inscricaoMunicipalPrestador = inscricaoMunicipalPrestador;
    }

    public String getTipoDocumentoTomador() {
        return tipoDocumentoTomador;
    }

    public void setTipoDocumentoTomador(String tipoDocumentoTomador) {
        this.tipoDocumentoTomador = tipoDocumentoTomador;
    }

    public String getNumeroCnpjCpfTomador() {
        return numeroCnpjCpfTomador;
    }

    public void setNumeroCnpjCpfTomador(String numeroCnpjCpfTomador) {
        this.numeroCnpjCpfTomador = numeroCnpjCpfTomador;
    }

    public String getInscricaoMunicipalTomador() {
        return inscricaoMunicipalTomador;
    }

    public void setInscricaoMunicipalTomador(String inscricaoMunicipalTomador) {
        this.inscricaoMunicipalTomador = inscricaoMunicipalTomador;
    }

    public String getRazaoSocialTomador() {
        return razaoSocialTomador;
    }

    public void setRazaoSocialTomador(String razaoSocialTomador) {
        this.razaoSocialTomador = razaoSocialTomador;
    }

    public String getEnderecoTomador() {
        return enderecoTomador;
    }

    public void setEnderecoTomador(String enderecoTomador) {
        this.enderecoTomador = enderecoTomador;
    }

    public String getNumeroEnderecoTomador() {
        return numeroEnderecoTomador;
    }

    public void setNumeroEnderecoTomador(String numeroEnderecoTomador) {
        this.numeroEnderecoTomador = numeroEnderecoTomador;
    }

    public String getComplementoEnderecoTomador() {
        return complementoEnderecoTomador;
    }

    public void setComplementoEnderecoTomador(String complementoEnderecoTomador) {
        this.complementoEnderecoTomador = complementoEnderecoTomador;
    }

    public String getBairroTomador() {
        return bairroTomador;
    }

    public void setBairroTomador(String bairroTomador) {
        this.bairroTomador = bairroTomador;
    }

    public Integer getCodigoMunicipioTomador() {
        return codigoMunicipioTomador;
    }

    public void setCodigoMunicipioTomador(Integer codigoMunicipioTomador) {
        this.codigoMunicipioTomador = codigoMunicipioTomador;
    }

    public String getUfTomador() {
        return ufTomador;
    }

    public void setUfTomador(String ufTomador) {
        this.ufTomador = ufTomador;
    }

    public Integer getCodigoPaisTomador() {
        return codigoPaisTomador;
    }

    public void setCodigoPaisTomador(Integer codigoPaisTomador) {
        this.codigoPaisTomador = codigoPaisTomador;
    }

    public String getCepTomador() {
        return cepTomador;
    }

    public void setCepTomador(String cepTomador) {
        this.cepTomador = cepTomador;
    }

    public String getTelefoneTomador() {
        return telefoneTomador;
    }

    public void setTelefoneTomador(String telefoneTomador) {
        this.telefoneTomador = telefoneTomador;
    }

    public String getEmailTomador() {
        return emailTomador;
    }

    public void setEmailTomador(String emailTomador) {
        this.emailTomador = emailTomador;
    }

    public String getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(String codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getArtObra() {
        return artObra;
    }

    public void setArtObra(String artObra) {
        this.artObra = artObra;
    }

    public Integer getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    public void setRegimeEspecialTributacao(Integer regimeEspecialTributacao) {
        this.regimeEspecialTributacao = regimeEspecialTributacao;
    }

    public Integer getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(Integer optanteSimplesNacional) {
        this.optanteSimplesNacional = optanteSimplesNacional;
    }

    public Integer getIncentivoFiscal() {
        return incentivoFiscal;
    }

    public void setIncentivoFiscal(Integer incentivoFiscal) {
        this.incentivoFiscal = incentivoFiscal;
    }

    public Integer getIsEnviada() {
        return isEnviada;
    }

    public void setIsEnviada(Integer isEnviada) {
        this.isEnviada = isEnviada;
    }

    public String getNumeroNfse() {
        return numeroNfse;
    }

    public void setNumeroNfse(String numeroNfse) {
        this.numeroNfse = numeroNfse;
    }

    public Integer getIsProblematica() {
        return isProblematica;
    }

    public void setIsProblematica(Integer isProblematica) {
        this.isProblematica = isProblematica;
    }

    public String getUsuarioInsercao() {
        return usuarioInsercao;
    }

    public void setUsuarioInsercao(String usuarioInsercao) {
        this.usuarioInsercao = usuarioInsercao;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getXmlEnvio() {
        return xmlEnvio;
    }

    public void setXmlEnvio(String xmlEnvio) {
        this.xmlEnvio = xmlEnvio;
    }

    public String getXmlRetorno() {
        return xmlRetorno;
    }

    public void setXmlRetorno(String xmlRetorno) {
        this.xmlRetorno = xmlRetorno;
    }

    public Integer getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Integer getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(Integer numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public String getCodigoVerificacaoNfse() {
        return codigoVerificacaoNfse;
    }

    public void setCodigoVerificacaoNfse(String codigoVerificacaoNfse) {
        this.codigoVerificacaoNfse = codigoVerificacaoNfse;
    }

    public Date getDataEmissaoNfse() {
        return dataEmissaoNfse;
    }

    public void setDataEmissaoNfse(Date dataEmissaoNfse) {
        this.dataEmissaoNfse = dataEmissaoNfse;
    }

    public String getOutrasInformacoesNfse() {
        return outrasInformacoesNfse;
    }

    public void setOutrasInformacoesNfse(String outrasInformacoesNfse) {
        this.outrasInformacoesNfse = outrasInformacoesNfse;
    }

    public Double getBaseCalculoNfse() {
        return baseCalculoNfse;
    }

    public void setBaseCalculoNfse(Double baseCalculoNfse) {
        this.baseCalculoNfse = baseCalculoNfse;
    }

    public Double getValorLiquidoNfse() {
        return valorLiquidoNfse;
    }

    public void setValorLiquidoNfse(Double valorLiquidoNfse) {
        this.valorLiquidoNfse = valorLiquidoNfse;
    }

    public Double getValorCreditoNfse() {
        return valorCreditoNfse;
    }

    public void setValorCreditoNfse(Double valorCreditoNfse) {
        this.valorCreditoNfse = valorCreditoNfse;
    }

    public Integer getCodigoMunicipioGeradorNfse() {
        return codigoMunicipioGeradorNfse;
    }

    public void setCodigoMunicipioGeradorNfse(Integer codigoMunicipioGeradorNfse) {
        this.codigoMunicipioGeradorNfse = codigoMunicipioGeradorNfse;
    }

    public String getUfOrgaoGeradorNfse() {
        return ufOrgaoGeradorNfse;
    }

    public void setUfOrgaoGeradorNfse(String ufOrgaoGeradorNfse) {
        this.ufOrgaoGeradorNfse = ufOrgaoGeradorNfse;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroRps != null ? numeroRps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envio)) {
            return false;
        }
        Envio other = (Envio) object;
        if ((this.numeroRps == null && other.numeroRps != null) || (this.numeroRps != null && !this.numeroRps.equals(other.numeroRps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.linepack.nfsemaringa.model.Envio[ numeroRps=" + numeroRps + " ]";
    }

    public void print() {
        System.out.println(
         "Envio{" + " numeroRps=" + numeroRps + ", serieRps=" + serieRps + ", tipoRps=" + tipoRps + ", isEnviada=" + isEnviada + ", numeroNfse=" + numeroNfse + ", isProblematica=" + isProblematica + ", usuarioInsercao=" + usuarioInsercao + ", dataInsercao=" + dataInsercao + ", usuarioAlteracao=" + usuarioAlteracao + ", dataAlteracao=" + dataAlteracao + ", numeroLote=" + numeroLote + '}');
    }

    
}
