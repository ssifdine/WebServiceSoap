package ma.saifdine.hd.ws;

import jakarta.jws.WebService;
import ma.saifdine.hd.model.Compte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService
public class WebServiceSoapImpl implements WebServiceSoap {


    @Override
    public double conversion(double mt) {
        return mt * 10;
    }

    @Override
    public Compte getCompte(int code) {
        return new Compte(code,1000.00);
    }

    @Override
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1,1000.00));
        comptes.add(new Compte(2,1500.00));
        comptes.add(new Compte(3,2000.00));
        return comptes;
    }
}
