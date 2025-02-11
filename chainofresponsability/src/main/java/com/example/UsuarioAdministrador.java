package com.example;

public class UsuarioAdministrador extends Usuario{
    public UsuarioAdministrador(Usuario superior){
        listaPermissoes.add(TipoPermissaoExcluir.getTipoPermissaoExcluir());
        listaPermissoes.add(TipoPermissaoGerenciarConfig.getTipoPermissaoGerenciarConfig());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario(){
        return "Administrador";
    }
}
