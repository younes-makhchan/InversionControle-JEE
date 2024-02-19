package pres;

import dao.IDao;
import matier.IMetier;
import matier.IMetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres {
    public static void main(String[] args) throws Exception {
        //making this extendable  more then modifiable    : Spring concept
        /**learned
         * cable forte is not extendible    class cls=new cls //bad
         * 0- instantiation statique(always cablage fort ) bad
         * 1-No  couplage fort, that's why we  write classes variables  in classes  not  in interface(final static,not extendible)
         * 2-always do interface then class as possible (for extendibilty) like creating a standard (to make it easy always the function we going to use should be in the interface)
         * 3- if you want to couple , couple with an interface  not a class (exntedible) to inject it later in construct  or  setter
         * 4- in main we  to add exntedbility we can use a  config file  instead of writing code
         * 5- you want to add feature  add classes don't modify the code
         * */
        Scanner sc=new Scanner(new File("config.txt"));
        String daoClassName=sc.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao idao=(IDao) cDao.getConstructor().newInstance();

        String metierClassName=sc.nextLine();
        Class cmetier=Class.forName(metierClassName);
        IMetier iMetier=(IMetier)cmetier.getConstructor(IDao.class).newInstance();
//        Method setDao=cmetier.getDeclaredMethod("setDao",IDao.class);
//        setDao.invoke(iMetier,idao);//inject dependicy and  dynamicly using reflection(making rules absolute)
        System.out.println(iMetier.calcul());
    }
}
