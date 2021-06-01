package BLL;

import BLL.Fitnesi;
import BLL.Pagesa;
import BLL.Trajneri;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-24T23:33:39")
@StaticMetamodel(Klienti.class)
public class Klienti_ { 

    public static volatile SingularAttribute<Klienti, String> emri;
    public static volatile SingularAttribute<Klienti, Fitnesi> fid;
    public static volatile CollectionAttribute<Klienti, Pagesa> pagesaCollection;
    public static volatile SingularAttribute<Klienti, Integer> kid;
    public static volatile SingularAttribute<Klienti, Integer> nrPersonal;
    public static volatile SingularAttribute<Klienti, String> adresa;
    public static volatile SingularAttribute<Klienti, String> mbiemri;
    public static volatile SingularAttribute<Klienti, Character> gjinia;
    public static volatile SingularAttribute<Klienti, String> qyteti;
    public static volatile SingularAttribute<Klienti, Integer> mosha;
    public static volatile SingularAttribute<Klienti, Trajneri> tid;

}