package br.cefetmg.mockloginapi.dto;

public class UsuarioDTO {

    private int id;

    private String nome;
    private String senha;
    private String cpf;
    private String foto;
    private String departamento;
    private String tipoUsuario;

    public UsuarioDTO(int id, String nome, String senha, String cpf, String foto, String departamento) {
        setId(id);
        setNome(nome);
        setSenha(senha);
        setCpf(cpf);
        setFoto(foto);
        setDepartamento(departamento);
    }

    //Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
