package Entities;

public class ProjetMobile extends Projet
{

    private int nbEcrans;


    public ProjetMobile(int idProjet, String nomProjet, int duree, double tauxHoraire, int nbEcrans) {
        super(idProjet, nomProjet, duree, tauxHoraire);
        this.nbEcrans = nbEcrans;
    }

    public double calculerMontant()
    {
        return super.calculerMontant() + nbEcrans*200;
    }

    public String getInfos()
    {
        return super.getInfos() +" Nb écrans : "+nbEcrans;
    }


}
