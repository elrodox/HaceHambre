package cl.uv.ici.tallerdeandroid.hacehambre.model.combo;


/**
 * Created by Rodolfo on 18/12/2016.
 */
public class EmptyComboBuilder implements IComboBuilder {
    private ICombo combo = null;
    private boolean builded = false;
    @Override
    public ICombo build() {
        builded = true;
        combo = new Combo();
        return combo;
    }

    @Override
    public ICombo getCombo() {
        if(!builded) return build();
        return combo;
    }
}
