package br.com.usinasantafe.pia.model.bean;

public class AtualAplicBean {

    private Long nroAparelho;
    private String versao;
    private String dthr;
    private String token;

    public AtualAplicBean() {
    }

    public Long getNroAparelho() {
        return nroAparelho;
    }

    public void setNroAparelho(Long nroAparelho) {
        this.nroAparelho = nroAparelho;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getDthr() {
        return dthr;
    }

    public void setDthr(String dthr) {
        this.dthr = dthr;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
