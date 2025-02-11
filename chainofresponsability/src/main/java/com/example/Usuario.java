package com.example;

import java.util.ArrayList;

public abstract class Usuario {

    protected ArrayList listaPermissoes = new ArrayList();
    private Usuario usuarioSuperior;

    public Usuario getUsuarioSuperior(){
        return this.usuarioSuperior;
    }
    public void setUsuarioSuperior(Usuario usuarioSuperior){
        this.usuarioSuperior = usuarioSuperior;
    }

    public abstract String getDescricaoUsuario();

    public String verificarPermissao(Permissao permissao){
        if(listaPermissoes.contains(permissao.getTipoPermissao())){
            return getDescricaoUsuario();
        }
        else{
            if(usuarioSuperior != null){
                return usuarioSuperior.verificarPermissao(permissao);

            }
            else{
                return "Nao necessita de permissao";
            }
        }
    }

}
