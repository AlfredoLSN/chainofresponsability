package com.example;

public class TipoPermissaoComentar implements TipoPermissao{
    private static TipoPermissaoComentar tipoPermissaoComentar = new TipoPermissaoComentar();
    private TipoPermissaoComentar(){};
    public static TipoPermissaoComentar getTipoPermissaoComentar(){
        return tipoPermissaoComentar;
    }
}
