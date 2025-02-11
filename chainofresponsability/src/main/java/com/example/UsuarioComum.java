package com.example;

public class UsuarioComum extends Usuario{
    public UsuarioComum(Usuario superior){
        listaPermissoes.add(TipoPermissaoComentar.getTipoPermissaoComentar());
        setUsuarioSuperior(superior);
    }

    public String getDescricaoUsuario(){
        return "Comum";
    }

}
