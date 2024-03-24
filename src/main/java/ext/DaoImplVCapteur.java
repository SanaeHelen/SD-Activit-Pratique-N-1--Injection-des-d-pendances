package ext;

import dao.IDao;

public class DaoImplVCapteur implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur ");
        double data= 60;
        return data;
    }
}
