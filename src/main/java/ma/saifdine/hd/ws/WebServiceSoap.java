package ma.saifdine.hd.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import ma.saifdine.hd.model.Compte;


import java.util.List;

@WebService
public interface WebServiceSoap {

    @WebMethod
    public double conversion(double mt);
    @WebMethod
    public Compte getCompte(int code);
    @WebMethod
    public List<Compte> getComptes();
}
