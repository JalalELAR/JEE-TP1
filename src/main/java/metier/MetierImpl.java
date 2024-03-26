package metier;

import dao.IDao;
import ext.DaoImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements Imetier{
    @Autowired
    private IDao dao;//couplage faible
   /* public MetierImpl(IDao dao){
        this.dao=dao;
    }*/
    @Override
    public double calcul() {
        double d= dao.getData();
        return d*3;
    }

    public void setDao (IDao dao){
        this.dao=dao;
    }
}
