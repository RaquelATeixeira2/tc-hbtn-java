public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;


    public Endereco(String lo, String nu, String co, String ba, String ci, String es, String pa){
        this.logradouro = lo;
        this.numero = nu;
        this.complemento = co;
        this.bairro = ba;
        this.cidade = ci;
        this.estado = es;
        this.pais = pa;
    }


    
    public String getLogradouro() {
        return logradouro;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    
}
