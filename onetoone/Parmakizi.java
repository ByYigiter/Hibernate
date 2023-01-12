package examples.onetoone;


import javax.persistence.*;

@Entity
@Table(name = "PARMAKIZI")
public class Parmakizi {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "parmakizi")
    @SequenceGenerator(name = "parmakizi",sequenceName = "parmakiziseq")
    private Long id;
    @Column(length = 100)

    private  String dosyaNo;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true,optional = false)
    // mappedBy = "kisi" diğer tarafta yazılı olduğu için tablo burada oluşur ve
    // ilişki sahibi burasıdır. önce burası silinmesi gerekir
    private Kisi kisi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDosyaNo() {
        return dosyaNo;
    }

    public void setDosyaNo(String dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    public Kisi getKisi() {
        return kisi;
    }

    public void setKisi(Kisi kisi) {
        this.kisi = kisi;
    }
}
