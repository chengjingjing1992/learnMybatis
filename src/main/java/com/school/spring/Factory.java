package com.school.spring;

/**
 * @author chengjinging
 * @date 2020/8/13 上午12:08
 */
public class Factory {
    private Eletricity eletricity;


    public void setEletricity(Eletricity eletricity){
        this.eletricity=eletricity;
    }

    public void youdian(){
        eletricity.getEletricity();
    }





}
