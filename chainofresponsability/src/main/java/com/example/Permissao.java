package com.example;

public class Permissao {
    private TipoPermissao tipoPermissao;
    public Permissao(TipoPermissao tipoPermissao){
        this.tipoPermissao = tipoPermissao;
    }
    public TipoPermissao getTipoPermissao(){
        return this.tipoPermissao;
    }
    public void setTipoPermissao(TipoPermissao tipoPermissao){
        this.tipoPermissao = tipoPermissao;
    }
}
