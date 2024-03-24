package metier;

import dao.IDao;

public class MetierImpl implements Imetier{
    private IDao dao;//couplage faible
    public MetierImpl(IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double d= dao.getData();
        return d*3;
    }


}
