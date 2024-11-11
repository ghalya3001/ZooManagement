import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<employe>{
    private List<employe> employes = new ArrayList<>();


    @Override
    public void ajouterEmploye(employe employe) {
        employes.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(employe employe) {
        employes.remove(employe);

    }

    @Override
    public void displayEmploye() {
        for (employe employe : employes) {
            System.out.println(employe);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(employe::getId));

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
