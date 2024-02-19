package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("vws")
public class IDaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version web Server");
        double data=34;
        return data;
    }
}
