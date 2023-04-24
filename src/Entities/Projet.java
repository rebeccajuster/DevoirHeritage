package Entities;

public class Projet implements Comparable<Projet>
{
    private int idProjet;
    private String nomProjet;
    private int duree;
    private double tauxHoraire;

    public Projet(int idProjet, String nomProjet, int duree, double tauxHoraire) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public int compareTo(Projet o)
    {
        return Double.compare(o.calculerMontant(),this.calculerMontant());
    }

    public double calculerMontant()
    {
        return duree*tauxHoraire*8;
    }

    public String getInfos()
    {
        return "Numero : "+idProjet+" Nom : "+nomProjet+" Durée : "+duree+" Taux horaire : "+tauxHoraire;
    }
}
