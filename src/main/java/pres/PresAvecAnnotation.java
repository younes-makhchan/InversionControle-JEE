package pres;

import matier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class PresAvecAnnotation {
    public static void main(String[] args) {
        //load objects from  dao,ext,matier
        ApplicationContext context=new AnnotationConfigApplicationContext("dao","ext","matier");

        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
