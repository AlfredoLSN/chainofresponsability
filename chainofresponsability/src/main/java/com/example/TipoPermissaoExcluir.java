package com.example;

public class TipoPermissaoExcluir implements TipoPermissao{
    private static TipoPermissaoExcluir tipoPermissaoExcluir = new TipoPermissaoExcluir();
    private TipoPermissaoExcluir(){};
    public static TipoPermissaoExcluir getTipoPermissaoExcluir(){
        return tipoPermissaoExcluir;
    }
}
