package matier;

import dao.IDao;

import org.springframework.stereotype.Service;

@Service //init instant  as component with name IMetierImpl
public class IMetierImpl implements IMetier {
//    @Autowired  //auto assigne  depedning on the previous  DAO  initiated if there is many dao will try to match name if not found :  throw error , use Qualifier an put a name
//    @Qualifier("vws")
    private IDao dao;//couplage faible , always depend on interfaces not in their implementation

    //better approach for injection spring
    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*1.5;
        return res;
    }

    /**
     * Pour Permetter d'injecter  dans la variable dao
     * un objet d'une class qui implemente l'interface IDao
     * @param dao
     */
//    public void setDao(IDao dao) {
//        this.dao = dao;
//    }

}
