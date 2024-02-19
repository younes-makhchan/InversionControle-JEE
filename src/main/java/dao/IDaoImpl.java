package dao;

import org.springframework.stereotype.Repository;

@Repository("daos")  //init instant  as component with name daos
public class IDaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("version base de donne");
        double data=34;
        return  data;
    }
}
