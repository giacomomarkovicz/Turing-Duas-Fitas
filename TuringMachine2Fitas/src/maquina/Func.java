
package maquina;


public class Func {
    private String estAtual;
    private String leSimb;
    private String proxEst;
    private String escSimb;
    private String movFita;
    private String estAtual2;
    private String leSimb2;
    private String proxEst2;
    private String escSimb2;
    private String movFita2;

    public Func(){    
    }
    
    public Func(String estAtual, String leSimb, String proxEst, String escSimb, String movFita, String estAtual2, String leSimb2, String proxEst2, String escSimb2, String movFita2){   
        this.estAtual = estAtual;
        this.leSimb = leSimb;
        this.proxEst = proxEst;
        this.escSimb = escSimb;
        this.movFita = movFita;
        this.estAtual2 = estAtual2;
        this.leSimb2 = leSimb2;
        this.proxEst2 = proxEst2;
        this.escSimb2 = escSimb2;
        this.movFita2 = movFita2;
    }
    
    public String getEstAtual() {
        return estAtual;
    }

    public void setEstAtual(String estAtual) {
        this.estAtual = estAtual;
    }

    public String getLeSimb() {
        return leSimb;
    }

    public void setLeSimb(String leSimb) {
        this.leSimb = leSimb;
    }

    public String getProxEst() {
        return proxEst;
    }

    public void setProxEst(String proxEst) {
        this.proxEst = proxEst;
    }

    public String getEscSimb() {
        return escSimb;
    }

    public void setEscSimb(String escSimb) {
        this.escSimb = escSimb;
    }

    public String getMovFita() {
        return movFita;
    }
    
    public void setMovFita(String movFita) {
        this.movFita = movFita;
    }
    
    public String getFuncao() {
        return "(" + getEstAtual() + "," + getLeSimb() + ") = (" + getProxEst() + "," + getEscSimb()+ "," + getMovFita() +") / (" + getEstAtual2() + "," + getLeSimb2() + ") = (" + getProxEst2() + "," + getEscSimb2()+ "," + getMovFita2() +")";
    }

    /**
     * @return the estAtual2
     */
    public String getEstAtual2() {
        return estAtual2;
    }

    /**
     * @param estAtual2 the estAtual2 to set
     */
    public void setEstAtual2(String estAtual2) {
        this.estAtual2 = estAtual2;
    }

    /**
     * @return the leSimb2
     */
    public String getLeSimb2() {
        return leSimb2;
    }

    /**
     * @param leSimb2 the leSimb2 to set
     */
    public void setLeSimb2(String leSimb2) {
        this.leSimb2 = leSimb2;
    }

    /**
     * @return the proxEst2
     */
    public String getProxEst2() {
        return proxEst2;
    }

    /**
     * @param proxEst2 the proxEst2 to set
     */
    public void setProxEst2(String proxEst2) {
        this.proxEst2 = proxEst2;
    }

    /**
     * @return the escSimb2
     */
    public String getEscSimb2() {
        return escSimb2;
    }

    /**
     * @param escSimb2 the escSimb2 to set
     */
    public void setEscSimb2(String escSimb2) {
        this.escSimb2 = escSimb2;
    }

    /**
     * @return the movFita2
     */
    public String getMovFita2() {
        return movFita2;
    }

    /**
     * @param movFita2 the movFita2 to set
     */
    public void setMovFita2(String movFita2) {
        this.movFita2 = movFita2;
    }

    
}
