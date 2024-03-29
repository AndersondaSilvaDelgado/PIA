package br.com.usinasantafe.pia.model.bean.estaticas;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import br.com.usinasantafe.pia.model.pst.Entidade;

/**
 * Created by anderson on 04/07/2017.
 */
@DatabaseTable(tableName="tbsecaoest")
public class SecaoBean extends Entidade {

    private static final long serialVersionUID = 1L;

    @DatabaseField(id=true)
    private Long idSecao;
    @DatabaseField
    private Long codSecao;
    @DatabaseField
    private String descrSecao;

    public SecaoBean() {
    }

    public Long getIdSecao() {
        return idSecao;
    }

    public void setIdSecao(Long idSecao) {
        this.idSecao = idSecao;
    }

    public Long getCodSecao() {
        return codSecao;
    }

    public void setCodSecao(Long codSecao) {
        this.codSecao = codSecao;
    }

    public String getDescrSecao() {
        return descrSecao;
    }

    public void setDescrSecao(String descrSecao) {
        this.descrSecao = descrSecao;
    }
}
