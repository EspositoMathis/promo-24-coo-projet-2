package duckcorp.duck;

/**
 * Interface représentant un objet dont on peut évaluer la qualité.
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Qualifiable {

    /** Retourne le score de qualité (entre 0 et 100). */
    int getQualityScore();

    /**
     * Retourne true si le score de qualité est strictement inférieur à 20.
     */
    default boolean isDefective() {
        return this.getQualityScore() < 20;
    }

    /**
     * Retourne un libellé décrivant la qualité :
     *   score >= 80 -> "Excellent" / >= 50 -> "Bon" / >= 20 -> "Médiocre" / < 20 -> "Défectueux"
     */
    default String getQualityLabel() {
        int score = this.getQualityScore();
        if (score>=80) return "Excellent";
        if (score>=50) return "Bon";
        if (score>=20) return "Médiocre";
        return "Défectueux";
    }
}
