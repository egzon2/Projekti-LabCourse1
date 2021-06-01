package BLL;

import BLL.Klienti;
import BLL.Stafi;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-24T23:33:39")
@StaticMetamodel(Trajneri.class)
public class Trajneri_ { 

    public static volatile SingularAttribute<Trajneri, String> emri;
    public static volatile SingularAttribute<Trajneri, Integer> nrTelefonit;
    public static volatile SingularAttribute<Trajneri, String> adresa;
    public static volatile SingularAttribute<Trajneri, String> mbiemri;
    public static volatile SingularAttribute<Trajneri, Character> gjinia;
    public static volatile SingularAttribute<Trajneri, String> qyteti;
    public static volatile CollectionAttribute<Trajneri, Klienti> klientiCollection;
    public static volatile SingularAttribute<Trajneri, Integer> tid;
    public static volatile SingularAttribute<Trajneri, Integer> mosha;
    public static volatile SingularAttribute<Trajneri, Stafi> sid;

}