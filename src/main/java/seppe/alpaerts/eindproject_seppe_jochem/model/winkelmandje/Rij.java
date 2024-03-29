package seppe.alpaerts.eindproject_seppe_jochem.model.winkelmandje;

import seppe.alpaerts.eindproject_seppe_jochem.model.product.DierenProduct;

/**
 * Autor: Seppe
 * klasse om een bepaalde rij te maken in het winkelmandje
 */

public class Rij {
    private DierenProduct dierenProduct;
    private int aantal;

    public Rij(DierenProduct dierenProduct, int aantal) {
        this.dierenProduct = dierenProduct;
        this.aantal = aantal;
    }

    public Rij(int aantal) {
        this.dierenProduct = dierenProduct;
        this.aantal++;
    }

    public DierenProduct getDierenProduct() {
        return dierenProduct;
    }

    public void setDierenProduct(DierenProduct dierenProduct) {
        this.dierenProduct = dierenProduct;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }


}
