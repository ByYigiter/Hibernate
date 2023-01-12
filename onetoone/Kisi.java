package examples.onetoone;

import javax.persistence.*;

@Entity
@Table(name = "KISI")
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "kisi")
    @SequenceGenerator(name = "kisi",sequenceName = "kisiseq")
    private Long id;
    @Column(length = 100)
    private String name;

    @OneToOne(fetch = FetchType.LAZY,optional = false,mappedBy = "kisi")
    //mappedby burada ise bu tabloya yeni kolon eklenmez
    // 2 kural ilişki sahibi diğer tablo olduğunu söyluyoruz mappedby ile
        // yani önce burayı silemeyiz
    private Parmakizi parmakizi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parmakizi getParmakizi() {
        return parmakizi;
    }

    public void setParmakizi(Parmakizi parmakizi) {
        this.parmakizi = parmakizi;
    }
}
