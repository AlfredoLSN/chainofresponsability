package com.example;

public class UsuarioModerador extends Usuario{
    public UsuarioModerador(Usuario superior){
        listaPermissoes.add(TipoPermissaoEditar.getTipoPermissaoEditar());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario(){
        return "Moderador";
    }
}
