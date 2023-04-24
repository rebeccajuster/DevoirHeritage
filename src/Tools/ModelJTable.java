package Tools;

import Entities.Projet;
import Entities.ProjetMobile;
import Entities.ProjetWeb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasProjets(ArrayList<Projet> uneListe)
    {

      colonnes =  new String[]{"Description","montant"};
      lignes = new Object[uneListe.size()][2];
      int i = 0;

      for(Projet p :uneListe)
      {
          lignes[i][0] = p.getInfos();
          lignes[i][1] = p.calculerMontant();
          i++;
      }
      fireTableChanged(null);

    }
}
