package duckcorp.machine;

/**
 * Interface représentant une machine pouvant être entretenue.
 * @author Roussille Philippe <roussille@3il.fr>
 */
public interface Maintainable {

    /** Retourne l'état de la machine (entre 0 et 100). */
    int getCondition();

    /** Effectue une opération de maintenance sur la machine. */
    void maintain();

    /**
     * Retourne true si la machine nécessite une maintenance (condition < 30).
     */
    default boolean needsMaintenance() {
        return this.getCondition() < 30;
    }

    /**
     * Retourne un libellé décrivant l'état de la machine :
     *   condition >= 80 -> "Parfait" / >= 50 -> "Correct" / >= 30 -> "Usé" / < 30 -> "Critique"
     */
    default String getConditionLabel() {
        int etat = getCondition();
        if (etat>=80) return "Parfait";
        if (etat>=50) return "Correct";
        if (etat>=80) return "Usé";
        return "Critique";
    }
}
