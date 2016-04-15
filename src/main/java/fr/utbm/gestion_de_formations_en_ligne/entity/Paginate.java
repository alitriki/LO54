/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.utbm.gestion_de_formations_en_ligne.entity;

/**
 *
 * @author Eddie
 */
public class Paginate {

    private int firstResult;
    private int maxResult;

    public Paginate(int firstResult, int maxResult) {
        this.firstResult = firstResult;
        this.maxResult = maxResult;
    }

    public Paginate() {
        this.firstResult = 0;
        this.maxResult = 10;
    }

    public int getFirstResult() {
        return firstResult;
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public void next() {
        this.setFirstResult(this.getFirstResult() + this.getMaxResult());
    }
}
