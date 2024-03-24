package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version 1 par instanciation statique");
         return 34;
    }
}
