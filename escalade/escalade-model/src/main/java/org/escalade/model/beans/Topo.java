package org.escalade.model.beans;

import java.util.*;


public class Topo {
    // attributs
    private int id;
    private String region;
    private String proprietaire;
    private boolean disponible;
    private List<Date> dateLibre;
    private List<Site> site;

    // constructeurs
    public Topo() {
        id = 0;
        region= null;
        proprietaire = null;
        disponible = false;
        dateLibre = null;
        site = null;
    }

    public Topo(int id, String region, String proprietaire,
                boolean disponible, List<Date> dateLibre, List<Site> site)
                throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du topo incorrect.");
        }
        this.id = id;
        if (region == null || region.compareTo("") == 0){
            throw new BeanException("Région du topo incorrect.");
        }
        this.region= region;
        if (proprietaire == null || proprietaire.compareTo("") == 0){
            throw new BeanException("Propriétaire du topo incorrect.");
        }
        this.proprietaire = proprietaire;
        this.disponible = disponible;
        if (dateLibre == null){
            throw new BeanException("Date de disponibilité du topo incorrect.");
        }
        this.dateLibre = dateLibre;
        if (site == null){
            throw new BeanException("Site du topo incorrect.");
        }
        this.site = site;
    }

    // getters and setter
    public int getId() {
        return id;
    }

    public void setId(int id) throws BeanException {
        if (id == 0){
            throw new BeanException("Identifiant du topo incorrect.");
        }
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) throws BeanException {
        if (region == null || region.compareTo("") == 0){
            throw new BeanException("Région du topo incorrect.");
        }
        this.region = region;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) throws BeanException {
        if (proprietaire == null || proprietaire.compareTo("") == 0){
            throw new BeanException("Propriétaire du topo incorrect.");
        }
        this.proprietaire = proprietaire;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Date> getdateLibre() {
        return dateLibre;
    }

    public void setdateLibre(List<Date> dateLibre) throws BeanException {
        if (dateLibre == null){
            throw new BeanException("Date de disponibilité du topo incorrect.");
        }
        this.dateLibre = dateLibre;
    }

    public List<Site> getSite() {
        return site;
    }

    public void setSite(List<Site> site) throws BeanException {
        if (site == null){
            throw new BeanException("Site du topo incorrect.");
        }
        this.site = site;
    }
}