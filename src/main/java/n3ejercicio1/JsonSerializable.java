package n3ejercicio1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
    String directory() default "C:\\Intellij\\Gerarquias\\src\\main\\java\\n3ejercicio1";
}
