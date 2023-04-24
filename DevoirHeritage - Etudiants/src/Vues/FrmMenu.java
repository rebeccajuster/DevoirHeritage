package Vues;

import Entities.Projet;
import Entities.ProjetMobile;
import Entities.ProjetWeb;
import Tools.ModelJTable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class FrmMenu extends JFrame{
    private JPanel pnlRoot;
    private JTable tblProjets;



    public FrmMenu()
    {
        this.setTitle("Devoir - Concepts POO");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

    }

    public void loadDatas()
    {
        /*
        Projet projet1 = new Projet(1,"Projet 1",10,45.18);
        Projet projet2 = new Projet(2,"Projet 2",5,33.00);
        ProjetWeb projetWeb1 = new ProjetWeb(3,"Site vitrine", 30, 50.0, 5, true);
        ProjetWeb projetWeb2 = new ProjetWeb(4,"Site du club", 60, 70.0, 10,false);
        ProjetMobile projetMobile1 =new ProjetMobile(5,"Application Android",4,50,7);
        ProjetMobile projetMobile2 =new ProjetMobile(6,"Application IOS",6,70,5);

        mesProjets.add(projet1);
        mesProjets.add(projet2);
        mesProjets.add(projetWeb1);
        mesProjets.add(projetWeb2);
        mesProjets.add(projetMobile1);
        mesProjets.add(projetMobile2);

         */
    }
}
