package com.szentebalint;

public class Main {

    public static void main(String[] args) {

      Mall mammut = new Mall("Mammut", 47.50856580220375, 19.02611876838032);
      Mall allee = new Mall ("Allee", 47.47522279877298, 19.04915575488498);
      Mall momPark = new Mall ("MOM Park", 47.4909587622745, 19.023608437137412);

      River duna = new River("Duna", 47.50611654136502, 19.041787445495487);
      duna.addCoordinate(47.66470606310258, 19.08088568240104);
      duna.addCoordinate(47.76511432902914, 18.934630985096327);

      River tisza = new River("Tisza", 47.69809860099094, 20.936650090688047);
      tisza.addCoordinate(47.684815611292755, 20.901070299924793);
      tisza.addCoordinate(47.67196113098265, 20.844398785887126);

      Layer<Mall> layer1 = new Layer<>();
      layer1.addElement(mammut);
      layer1.addElement(momPark);
      layer1.addElement(allee);

      Layer<River> layer2 = new Layer<>();
      layer2.addElement(duna);
      layer2.addElement(tisza);

      layer1.renderLayer();
      layer2.renderLayer();

    }

}
