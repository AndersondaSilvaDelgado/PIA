package br.com.usinasantafe.pia.tb.estaticas;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import br.com.usinasantafe.pia.pst.Entidade;

/**
 * Created by anderson on 06/06/2017.
 */
@DatabaseTable(tableName="tbamostraest")
public class AmostraTO extends Entidade {

    private static final long serialVersionUID = 1L;

    @DatabaseField(id=true)
    private Long idAmostra;
    @DatabaseField
    private Long idAmostraOrganismo;
    @DatabaseField
    private Long codAmostra;
    @DatabaseField
    private Long seqAmostra;
    @DatabaseField
    private String descrAmostra;
    @DatabaseField
    private Long tipoAmostra;

    public AmostraTO() {
    }

    public Long getIdAmostra() {
        return idAmostra;
    }

    public void setIdAmostra(Long idAmostra) {
        this.idAmostra = idAmostra;
    }

    public Long getIdAmostraOrganismo() {
        return idAmostraOrganismo;
    }

    public void setIdAmostraOrganismo(Long idAmostraOrganismo) {
        this.idAmostraOrganismo = idAmostraOrganismo;
    }

    public Long getCodAmostra() {
        return codAmostra;
    }

    public void setCodAmostra(Long codAmostra) {
        this.codAmostra = codAmostra;
    }

    public Long getSeqAmostra() {
        return seqAmostra;
    }

    public void setSeqAmostra(Long seqAmostra) {
        this.seqAmostra = seqAmostra;
    }

    public String getDescrAmostra() {
        return descrAmostra;
    }

    public void setDescrAmostra(String descrAmostra) {
        this.descrAmostra = descrAmostra;
    }

    public Long getTipoAmostra() {
        return tipoAmostra;
    }

    public void setTipoAmostra(Long tipoAmostra) {
        this.tipoAmostra = tipoAmostra;
    }

}
