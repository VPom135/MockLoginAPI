package br.cefetmg.mockloginapi.dto;

public class UsuarioDTO {

    private long id;

    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private String foto;
    private String tipoUsuario;
    private String departamento;

    public UsuarioDTO(long id, String nome, String email, String senha, String cpf,
                      String foto, String tipoUsuario, String departamento)
    {
        setId(id);
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setCpf(cpf);
        setFoto(foto);
        setTipoUsuario(tipoUsuario);
        setDepartamento(departamento);
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getFoto() {
        return foto;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public String getDepartamento() {
        return departamento;
    }


    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
