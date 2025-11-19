package TampilanData;

import TampilanData.Karyawan;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-11-11T18:41:07", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Absensi.class)
public class Absensi_ { 

    public static volatile SingularAttribute<Absensi, String> idabsensi;
    public static volatile SingularAttribute<Absensi, Date> jamKeluar;
    public static volatile SingularAttribute<Absensi, Date> tanggal;
    public static volatile SingularAttribute<Absensi, Date> jamMasuk;
    public static volatile SingularAttribute<Absensi, Karyawan> idkaryawan;

}