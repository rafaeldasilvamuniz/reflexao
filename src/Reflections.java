import java.*;
/**
 * @author Rafael da silva Muniz
 */
public class Reflections {

    public static void main(String args[]) {


        Class clazz = Produto.class;
        System.out.println(clazz);

        Produto prod = new Produto();
        Class clazz1 = prod.getClass();
        System.out.println(clazz1);

        try {
            Constructor cons = clazz.getConstructor();
            Produto prod1 = (Produto) cons.newInstance();
            System.out.println(cons);
            System.out.println(prod1);

            Field[] fields = prod1.getClass().getDeclaredFields();
            for (Field field : fields) {
                String nome = field.getName();
                System.out.println(nome);
                 //TipoChave tipo = field.getAnnotation(TipoChave.class);

              //  if(tipo != null){
                  //  System.out.println(tipo.value());
               // }
            }


        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
