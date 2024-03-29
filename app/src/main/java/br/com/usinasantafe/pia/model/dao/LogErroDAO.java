package br.com.usinasantafe.pia.model.dao;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import br.com.usinasantafe.pia.control.ConfigCTR;
import br.com.usinasantafe.pia.model.bean.variaveis.ConfigBean;
import br.com.usinasantafe.pia.model.bean.variaveis.LogErroBean;
import br.com.usinasantafe.pia.util.Tempo;

public class LogErroDAO {

    private static LogErroDAO instance = null;

    public static LogErroDAO getInstance() {
        if (instance == null)
            instance = new LogErroDAO();
        return instance;
    }

    public void insertLogErro(Throwable ex){
        ConfigCTR configCTR = new ConfigCTR();
        if(configCTR.hasElements()){
            ConfigBean configBean = configCTR.getConfig();
            LogErroBean logErroBean = new LogErroBean();
            logErroBean.setNroLinha(configBean.getNroAparelhoConfig());
            logErroBean.setException(throwableToString(ex));
            logErroBean.setDthr(Tempo.getInstance().dthrAtualString());
            logErroBean.setDthrLong(Tempo.getInstance().dthrStringToLong(Tempo.getInstance().dthrAtualString()));
            logErroBean.setStatus(1L);
            logErroBean.insert();
        }
    }

    public void insertLogErro(String erro){
        ConfigCTR configCTR = new ConfigCTR();
        if(configCTR.hasElements()){
            ConfigBean configBean = configCTR.getConfig();
            LogErroBean logErroBean = new LogErroBean();
            logErroBean.setNroLinha(configBean.getNroAparelhoConfig());
            logErroBean.setException("RETORNO SERVIDOR COM FALHA = " + erro);
            logErroBean.setDthr(Tempo.getInstance().dthrAtualString());
            logErroBean.setDthrLong(Tempo.getInstance().dthrStringToLong(Tempo.getInstance().dthrAtualString()));
            logErroBean.setStatus(1L);
            logErroBean.insert();
        }
    }

    private String throwableToString(Throwable t) {

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter, false);

        t.printStackTrace(printWriter);

        printWriter.flush();
        stringWriter.flush();

        return stringWriter.toString();

    }

    public List<LogErroBean> logErroBeanList(){
        LogErroBean logErroBean = new LogErroBean();
        return logErroBean.orderBy("idLogErro", false);
    }

    public void deleteLogErro(){
        LogErroBean logErroBean = new LogErroBean();
        List<LogErroBean> logErroList = logErroBean.all();
        for(LogErroBean logErroBeanBD : logErroList){
            if(logErroBeanBD.getDthrLong() < Tempo.getInstance().dthrLongDiaMenos(15)){
                logErroBeanBD.delete();
            }
        }
    }

}
