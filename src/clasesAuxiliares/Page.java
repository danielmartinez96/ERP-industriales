/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAuxiliares;
import java.util.*;
import modelo.Aviso;

public class Page {
    int pageSize, page, lastPage, totalElements;
    ArrayList<Aviso> results;
    public Page() {
        pageSize=page=lastPage=totalElements=0;
    results= new ArrayList<Aviso>();}

    public Page(ArrayList<Aviso> results, int page, int pageSize, int totalElements) {
        this.results = results;
        this.page = page;
        this.pageSize = pageSize;
        this.totalElements = totalElements; 
        lastPage = getLastPage(totalElements, pageSize);
    }

    public int getPage() { return page; }

    public void setPage(int page) { this.page = page; }

    public ArrayList<Aviso> getResults() { return results; }

    public void setResults(ArrayList<Aviso> results) { this.results = results; }

    public int getLastPage() { return lastPage; }

    public void setLastPage(int lastPage) { this.lastPage = lastPage; }

    public int getPageSize() { return pageSize; }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
     lastPage = getLastPage(totalElements, pageSize);}

    public int getTotalElements() {
        
        return totalElements; }

    public void setTotalElements(int totalElements) { this.totalElements = totalElements;
     lastPage = getLastPage(totalElements, pageSize);}

    /**
     * Devuelve el numero (posicion) del elementos inicial de una pagina dada.
     * A partir del elementos devuelto hay que pintar nPageSize elementos más.
     *
     * @param currentPage
     * @param pageSize
     * @return
     */
    public static int getStartItemByPage(int currentPage, int pageSize) {
        return Math.max((pageSize * (currentPage - 1)) + 1, 1);
        // El Math.max sirve para evitar los numeros negativos, siempre hay
        // algun malvado que puede pedirnos la pagina -10. En esos casos,
        // la pagina devuelta sera 1
    }

    public static int getLastPage(int totalElements, int pageSize) {
        int base = totalElements / pageSize;
        int mod = totalElements % pageSize;
        return base + (mod > 0?1:0);
    }
}