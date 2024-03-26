package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
         System.out.println("Version Base de donnees");
         double data = 34;
         return data;
    }
}
