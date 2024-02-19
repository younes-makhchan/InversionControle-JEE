package pres;

import matier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXml {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
