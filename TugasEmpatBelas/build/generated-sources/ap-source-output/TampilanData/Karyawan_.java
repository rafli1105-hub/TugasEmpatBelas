package TampilanData;

import TampilanData.Absensi;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-11T18:41:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Karyawan.class)
public class Karyawan_ { 

    public static volatile SingularAttribute<Karyawan, String> nama;
    public static volatile SingularAttribute<Karyawan, String> gender;
    public static volatile SingularAttribute<Karyawan, String> shift;
    public static volatile CollectionAttribute<Karyawan, Absensi> absensiCollection;
    public static volatile SingularAttribute<Karyawan, String> idkaryawan;
    public static volatile SingularAttribute<Karyawan, String> alamat;

}