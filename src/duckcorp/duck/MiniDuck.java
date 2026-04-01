package duckcorp.duck;

import java.util.Base64;

/**
 * Canard en plastique miniature.
 *
 * TODO (Ex1) :
 *   - Implémentez le constructeur MiniDuck(int qualityScore) avec un appel à super
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class MiniDuck extends Duck{

    public static final double BASE_PRICE = 12.0;

    public MiniDuck(int qualityScore) {
        super(DuckType.MINI, qualityScore);
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String describe() {
        return "Mini Canard";
    }
}
