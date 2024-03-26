package metier;

import dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    private IDao dao; // couplage faible
    public MetierImpl(IDao dao) {
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*12.5;
        return res;
    }

}


