package pres;
import dao.*;
import metier.*;
import ext.*;


import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();
        String metierClassName = sc.nextLine();
        Class cmetier= Class.forName(metierClassName);
        Imetier metier=(Imetier) cmetier.getConstructor().newInstance();
        Method setDao= cmetier.getMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);
        System.out.println("res :"+metier.calcul());
    }
}
