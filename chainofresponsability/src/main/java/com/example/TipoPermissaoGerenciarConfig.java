package com.example;

public class TipoPermissaoGerenciarConfig implements TipoPermissao {
    private static TipoPermissaoGerenciarConfig tipoPermissaoGerenciarConfig = new TipoPermissaoGerenciarConfig();
    private TipoPermissaoGerenciarConfig(){};
    public static TipoPermissaoGerenciarConfig getTipoPermissaoGerenciarConfig(){
        return tipoPermissaoGerenciarConfig;
    }
}
