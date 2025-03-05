import java.lang.annotation.*;

/**
 * @author ander
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.LOCAL_VARIABLE)

public @interface Tabela {

    String nomeDaTabela();
}
