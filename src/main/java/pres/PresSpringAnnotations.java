package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext("doa","metier");
        Imetier metier =context.getBean(Imetier.class);
        System.out.println("res version annotations : "+metier.calcul());
    }
}
