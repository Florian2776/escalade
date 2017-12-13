package org.escalade.app.beans;

public class Topo {
    // attributs
    private int id;
    private String region;
    private String proprietaire;
    private boolean estDisponible;
    private List<Date> dateLibre;
    private List<Site> site;

    // constructeurs
    public Topo() {
        id = null;
        region= null;
        proprietaire = null;
        estDisponible = false;
        dateLibre = null;
        site = null;
    }

    public Topo(int id, String region, String proprietaire,
                boolean estDisponible, List<Date> dateLibre, List<Site> site) {
        this.id = id;
        this.region= region;
        this.proprietaire = proprietaire;
        this.estDisponible = estDisponible;
        this.dateLibre = dateLibre;
        this.site = site;
    }

    // getters and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public boolean isestDisponible() {
        return estDisponible;
    }

    public void setestDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }

    public List<Date> getdateLibre() {
        return dateLibre;
    }

    public void setdateLibre(List<Date> dateLibre) {
        this.dateLibre = dateLibre;
    }

    public List<Site> getSite() {
        return site;
    }

    public void setSite(List<Site> site) {
        this.site = site;
    }

}