/**
 * Backing bean pour les page JSF  pour effectuer des opérations sur les nombres.
 *Portée : request
 *
 * @author NainaMatthieu
 */
package mg.itu.tp2.prgnaina4.jsf;

import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named(value = "bean1")
@RequestScoped
public class Bean1 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage_4?nb=" + nombre + "&;faces-redirect=true";
    }

    public String retourFormulaire() {
        return "formulaire_4?nb=" + nombre + "&;faces-redirect=true";
    }
    
       public String afficherIntoTemplate() {
        return "affichage__4?nb=" + nombre + "&;faces-redirect=true";
    }
}
