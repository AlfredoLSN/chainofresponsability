package com.example;

public class TipoPermissaoEditar implements TipoPermissao{
    private static TipoPermissaoEditar tipoPermissaoEditar = new TipoPermissaoEditar();
    private TipoPermissaoEditar(){};
    public static TipoPermissaoEditar getTipoPermissaoEditar(){
        return tipoPermissaoEditar;
    }
}
