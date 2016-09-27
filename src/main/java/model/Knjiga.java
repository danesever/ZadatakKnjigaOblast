package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;
@DatabaseTable( tableName = "knjiga")
public class Knjiga {


    public static final String POLJE_NASLOV = "naslov";
    private static final String POLJE_BROJ_STRANA = "broj_strana";
    private static final String POLJE_DATUM_IZDAVANJA = "datum_izdavanja";
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NASLOV, canBeNull = false)
    private String naslov;
    @DatabaseField(foreignColumnName = POLJE_BROJ_STRANA, canBeNull = false)
    private int brojStrana;
    @DatabaseField (foreignColumnName = POLJE_DATUM_IZDAVANJA, canBeNull = false)
    private Date datumIzdanja;

    private boolean prisutna;

    public Knjiga() {
    }

    public Knjiga(String naslov, int brojStrana, Date datumIzdanja) {
        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.datumIzdanja = datumIzdanja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public boolean isPrisutna() {
        return prisutna;
    }

    public void setPrisutna(boolean prisutna) {
        this.prisutna = prisutna;
    }
    @ForeignCollectionField(foreignFieldName = "oblast")
    private ForeignCollection<Oblast> oblast;

    public ForeignCollection<Oblast> getOblast() {
        return oblast;
    }

    public void setOblast(ForeignCollection<Oblast> oblast) {
        this.oblast = oblast;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naslov='" + naslov + '\'' +
                ", brojStrana=" + brojStrana +
                ", datumIzdanja=" + datumIzdanja +
                '}';
    }
}
