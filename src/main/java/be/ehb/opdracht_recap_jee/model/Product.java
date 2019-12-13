package be.ehb.opdracht_recap_jee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @NotBlank
    public String productNaam;
    @NotBlank
    public String omschrijving;
    @NotBlank
    public BigDecimal prijs;
    @NotBlank
    public String naamContactpersoon;
    @NotBlank
    public String emailContactpersoon;

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductNaam() {
        return productNaam;
    }

    public void setProductNaam(String productNaam) {
        this.productNaam = productNaam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public String getNaamContactpersoon() {
        return naamContactpersoon;
    }

    public void setNaamContactpersoon(String naamContactpersoon) {
        this.naamContactpersoon = naamContactpersoon;
    }

    public String getEmailContactpersoon() {
        return emailContactpersoon;
    }

    public void setEmailContactpersoon(String emailContactpersoon) {
        this.emailContactpersoon = emailContactpersoon;
    }
}
