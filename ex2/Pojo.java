package examples.ex2;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "POJO_TABLE")
public class Pojo {
    @SequenceGenerator(name = "seq",sequenceName = "pojo_id_seq", allocationSize = 8,initialValue = 56)
    /*
    başlangıç degeri =56 olarak belirledik
    allocationSize = 8 olursa
        1
        2
        10
        18 id sıralaması bu şekilde olur
    * */
    @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    @Column(name = "saat")
    private Date saat;

    @Column(name ="ADI",length = 50,unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getSaat() {
        return saat;
    }

    public void setSaat(Date saat) {
        this.saat = saat;
    }
}
