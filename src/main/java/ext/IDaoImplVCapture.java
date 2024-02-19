package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("vc")
public class IDaoImplVCapture implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donne");
        double data=34;
        return data;
    }
}
