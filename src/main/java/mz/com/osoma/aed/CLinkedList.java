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
public class CLinkedList implements Operacoes {

    private CLink actual;
    private int totalDeElementos;

    @Override
    public boolean isEmpty() {
        return actual == null; 
    }

    @Override
    public long tamanho() {
        return this.totalDeElementos;
    }

    @Override
    public void adiciona(int elemento) {
        if(isEmpty()){
            actual = new CLink(elemento);
            actual.proxima = actual;
        }else{
            CLink nova = new CLink(elemento);
            nova.proxima = actual.proxima;
            actual.proxima = nova;
        }
        this.totalDeElementos++;
    }

    @Override
    public CLink contem(int elemento) {
        
        for (int i = 0; i < totalDeElementos; i++) {
            
            if(actual.dData == elemento){
                return actual;
            }else{
                actual = actual.proxima;;
            }
        }
        return null;
    }

    @Override
    public CLink remove() {
        if(isEmpty()){
            return null;
        }else if (totalDeElementos == 1){
            actual = null;
            totalDeElementos = 0;
            return null;
        }else{
            CLink temp = actual.proxima;
            actual.proxima = actual.proxima.proxima;
            totalDeElementos--;
            return temp;
        }
    }

    @Override
    public CLink peek() {
        return actual;
    }
    
    @Override
    public String toString() {
        // Verificando se a Lista está vazia
        if (this.totalDeElementos == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        CLink atual = actual;
        // Percorrendo até o penúltimo elemento.
        for (int i = 0; i < this.totalDeElementos - 1; i++) {
            builder.append(atual.dData);
            builder.append(", ");
            atual = atual.proxima;
        }
        // último elemento
        builder.append(atual.dData);
        builder.append("]");
        return builder.toString();
    }

}
