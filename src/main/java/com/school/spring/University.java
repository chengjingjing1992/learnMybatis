package com.school.spring;

/**
 * @author chengjinging
 * @date 2020/8/13 上午12:09
 */
public class University {
    private Eletricity eletricity;

    public void setEletricity(Eletricity eletricity){
        this.eletricity=eletricity;
    }


    public void youdian(){
        eletricity.getEletricity();
    }
}
