import java.lang.annotation.*;
import java.lang.reflect.Field;

@Documented
@Target(ElementType.FIELD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {
    int index();

    String title();

    String description() default "Default value";
}
