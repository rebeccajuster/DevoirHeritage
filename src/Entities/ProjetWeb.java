package Entities;

public class ProjetWeb extends Projet
{
    private int nbPages;
    private boolean responsive;

    public ProjetWeb(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbPages, boolean responsive) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbPages = nbPages;
        this.responsive = responsive;
    }



    public double calculerMontant()
    {
        int res = 0;
        if(responsive == true)
        {
            res = 500;
        }
        return super.calculerMontant() + nbPages*100 + res ;
    }

    public String getInfos()
    {
        return super.getInfos() +" Nb pages : "+nbPages +" Responsive : "+responsive;
    }

}
