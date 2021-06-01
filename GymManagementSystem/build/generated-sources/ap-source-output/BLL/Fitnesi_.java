package BLL;

import BLL.Klienti;
import BLL.Paisjet;
import BLL.Stafi;
import BLL.Zhveshtore;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-24T23:33:39")
@StaticMetamodel(Fitnesi.class)
public class Fitnesi_ { 

    public static volatile SingularAttribute<Fitnesi, Integer> fid;
    public static volatile SingularAttribute<Fitnesi, String> emri;
    public static volatile SingularAttribute<Fitnesi, Integer> nrTelefonit;
    public static volatile CollectionAttribute<Fitnesi, Stafi> stafiCollection;
    public static volatile SingularAttribute<Fitnesi, String> adresa;
    public static volatile SingularAttribute<Fitnesi, Integer> nrBiznesit;
    public static volatile CollectionAttribute<Fitnesi, Paisjet> paisjetCollection;
    public static volatile SingularAttribute<Fitnesi, String> qyteti;
    public static volatile CollectionAttribute<Fitnesi, Klienti> klientiCollection;
    public static volatile CollectionAttribute<Fitnesi, Zhveshtore> zhveshtoreCollection;

}