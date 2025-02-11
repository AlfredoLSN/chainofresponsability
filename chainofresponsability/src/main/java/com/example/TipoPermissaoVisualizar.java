package com.example;

public class TipoPermissaoVisualizar implements TipoPermissao{
    private static TipoPermissaoVisualizar tipoPermissaoVisualizar = new TipoPermissaoVisualizar();
    private TipoPermissaoVisualizar(){};
    public static TipoPermissaoVisualizar gTipoPermissaoVisualizar(){
        return tipoPermissaoVisualizar;
    }
}
    