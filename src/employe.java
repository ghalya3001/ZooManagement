import java.util.Objects;

public class employe {


    private int id;
    private String nom;
    private String prenom;
    private String dep;
    private int grade;

    public employe(int id, String nom, String prenom, String dep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dep = dep;
        this.grade = grade;
    }

    public employe(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dep='" + dep + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employe employe = (employe) o;
        return id == employe.id && grade == employe.grade && Objects.equals(nom, employe.nom) && Objects.equals(prenom, employe.prenom) && Objects.equals(dep, employe.dep);
    }


}
