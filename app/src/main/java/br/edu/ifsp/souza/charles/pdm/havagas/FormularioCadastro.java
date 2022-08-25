package br.edu.ifsp.souza.charles.pdm.havagas;

public class FormularioCadastro {

    private String nome;
    private String email;
    private Boolean recebeEmail;
    private String telefone;
    private String tipoTelefone;
    private String TelefoneCelular;
    private Boolean contemCelular;
    private String sexo;
    private String nascimento;
    private String formacao;
    private String anoConclusao;
    private String instituicao;
    private String anoGraduacao;
    private String anoEspecializacao;
    private String anoMestrado;
    private String anoDoutorado;
    private String tituloMonografia;
    private String orientador;
    private String vagas;

    public FormularioCadastro(String nome, String email, Boolean recebeEmail, String telefone,
                              String tipoTelefone, String telefoneCelular, Boolean contemCelular,
                              String sexo, String nascimento, String formacao, String anoConclusao,
                              String instituicao, String anoGraduacao, String anoEspecializacao,
                              String anoMestrado, String anoDoutorado, String tituloMonografia,
                              String orientador, String vagas) {
        this.nome = nome;
        this.email = email;
        this.recebeEmail = recebeEmail;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        TelefoneCelular = telefoneCelular;
        this.contemCelular = contemCelular;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.formacao = formacao;
        this.anoConclusao = anoConclusao;
        this.instituicao = instituicao;
        this.anoGraduacao = anoGraduacao;
        this.anoEspecializacao = anoEspecializacao;
        this.anoMestrado = anoMestrado;
        this.anoDoutorado = anoDoutorado;
        this.tituloMonografia = tituloMonografia;
        this.orientador = orientador;
        this.vagas = vagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getRecebeEmail() {
        return recebeEmail;
    }

    public void setRecebeEmail(Boolean recebeEmail) {
        this.recebeEmail = recebeEmail;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefoneCelular() {
        return TelefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        TelefoneCelular = telefoneCelular;
    }

    public Boolean getContemCelular() {
        return contemCelular;
    }

    public void setContemCelular(Boolean contemCelular) {
        this.contemCelular = contemCelular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(String anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getAnoGraduacao() {
        return anoGraduacao;
    }

    public void setAnoGraduacao(String anoGraduacao) {
        this.anoGraduacao = anoGraduacao;
    }

    public String getAnoEspecializacao() {
        return anoEspecializacao;
    }

    public void setAnoEspecializacao(String anoEspecializacao) {
        this.anoEspecializacao = anoEspecializacao;
    }
    public String getAnoMestrado() {
        return anoMestrado;
    }

    public void setAnoMestrado(String anoMestrado) {
        this.anoMestrado = anoMestrado;
    }

    public String getAnoDoutorado() {
        return anoDoutorado;
    }

    public void setAnoDoutorado(String anoDoutorado) {
        this.anoDoutorado = anoDoutorado;
    }

    public String getTituloMonografia() {
        return tituloMonografia;
    }

    public void setTituloMonografia(String tituloMonografia) {
        this.tituloMonografia = tituloMonografia;
    }
    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getVagas() {
        return vagas;
    }

    public void setVagas(String vagas) {
        this.vagas = vagas;
    }

    @Override
    public String toString() {
        return "FormularioCadastro{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", recebeEmail=" + recebeEmail +
                ", telefone='" + telefone + '\'' +
                ", tipoTelefone='" + tipoTelefone + '\'' +
                ", TelefoneCelular='" + TelefoneCelular + '\'' +
                ", contemCelular=" + contemCelular +
                ", sexo='" + sexo + '\'' +
                ", nascimento='" + nascimento + '\'' +
                ", formacao='" + formacao + '\'' +
                ", anoConclusao='" + anoConclusao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", anoGraduacao='" + anoGraduacao + '\'' +
                ", anoEspecializacao='" + anoEspecializacao + '\'' +
                ", anoMestrado='" + anoMestrado + '\'' +
                ", anoDoutorado='" + anoDoutorado + '\'' +
                ", tituloMonografia='" + tituloMonografia + '\'' +
                ", orientador='" + orientador + '\'' +
                ", vagas='" + vagas + '\'' +
                '}';
    }
}
