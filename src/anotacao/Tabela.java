import java.lang.annotation.*;

/**
 * @author Rafael da Silva Muniz
 */

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface Tabela {

    String nome();

}
