public interface Mappable {

    String getLabel();
    String getGeometryType();
    String getIconType();

    static String JSON_PROPERTY = "\"properties\":{%s}";

    default void toJSON() {

        System.out.printf((JSON_PROPERTY), getLabel() + getGeometryType() + getIconType());

    }

    static void printProperties(Mappable m) {
        System.out.println(String.format(JSON_PROPERTY, m.getLabel()) + m.getGeometryType() + m.getIconType());
    }

}
