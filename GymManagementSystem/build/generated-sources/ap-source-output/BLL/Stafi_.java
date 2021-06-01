package BLL;

import BLL.Fitnesi;
import BLL.Menagjeri;
import BLL.Puntori;
import BLL.Trajneri;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-24T23:33:39")
@StaticMetamodel(Stafi.class)
public class Stafi_ { 

    public static volatile SingularAttribute<Stafi, String> emri;
    public static volatile SingularAttribute<Stafi, Fitnesi> fid;
    public static volatile CollectionAttribute<Stafi, Menagjeri> menagjeriCollection;
    public static volatile SingularAttribute<Stafi, Integer> nrPersonal;
    public static volatile SingularAttribute<Stafi, String> pershkrimi;
    public static volatile SingularAttribute<Stafi, String> mbiemri;
    public static volatile CollectionAttribute<Stafi, Puntori> puntoriCollection;
    public static volatile SingularAttribute<Stafi, Integer> mosha;
    public static volatile CollectionAttribute<Stafi, Trajneri> trajneriCollection;
    public static volatile SingularAttribute<Stafi, Integer> sid;

}