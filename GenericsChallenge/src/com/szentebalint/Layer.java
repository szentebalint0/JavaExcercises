package com.szentebalint;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable>{

    private List<T> elementsToMap;

    public Layer() {
        this.elementsToMap = new ArrayList<>();
    }

    public Layer(List<T> elementsToMap) {
        elementsToMap = new ArrayList<>(elementsToMap);
    }

    public void addElement(T element){
        elementsToMap.add(element);
    }

    public void renderLayer(){

            for (T element : elementsToMap){
                element.render();
            }

    }
}
