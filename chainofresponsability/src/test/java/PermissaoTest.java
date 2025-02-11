
import com.example.Permissao;
import com.example.TipoPermissaoComentar;
import com.example.TipoPermissaoEditar;
import com.example.TipoPermissaoExcluir;
import com.example.TipoPermissaoGerenciarConfig;
import com.example.TipoPermissaoVisualizar;
import com.example.UsuarioAdministrador;
import com.example.UsuarioComum;
import com.example.UsuarioModerador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PermissaoTest {
    UsuarioComum comum;
    UsuarioModerador moderador;
    UsuarioAdministrador administrador;

    @BeforeEach
    void setUp(){
        administrador  = new UsuarioAdministrador(null);
        moderador = new UsuarioModerador(administrador);
        comum = new UsuarioComum(moderador);
    }

    @Test
    void deveRetornarComumParaComentarDocumento(){
        assertEquals("Comum", comum.verificarPermissao(new Permissao(TipoPermissaoComentar.getTipoPermissaoComentar())));
    }
    @Test
    void deveRetornarModeradorParaEditarDocumento(){
        assertEquals("Moderador", comum.verificarPermissao(new Permissao(TipoPermissaoEditar.getTipoPermissaoEditar())));
    }
    @Test
    void deveRetornarAdministradorParaExcluirDocumento(){
        assertEquals("Administrador", comum.verificarPermissao(new Permissao(TipoPermissaoExcluir.getTipoPermissaoExcluir())));
    }
    @Test
    void deveRetornarAdministradorParaGerenciarConfigDocumento(){
        assertEquals("Administrador", comum.verificarPermissao(new Permissao(TipoPermissaoGerenciarConfig.getTipoPermissaoGerenciarConfig())));
    }

    @Test
    void deveRetornarNaoNecessitaDePermissaoParaVisualizarDocumento(){
        assertEquals("Nao necessita de permissao", comum.verificarPermissao(new Permissao(TipoPermissaoVisualizar.gTipoPermissaoVisualizar())));
    }
}
