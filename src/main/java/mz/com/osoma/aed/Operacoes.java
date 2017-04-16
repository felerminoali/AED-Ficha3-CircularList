/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.com.osoma.aed;

/**
 *
 * @author feler
 */
public interface Operacoes {
    
    public boolean isEmpty();
    public long tamanho();
    public void adiciona(int elemento);
    public CLink contem(int elemento);
    public CLink remove();
    public CLink peek();
    
    
    
}
