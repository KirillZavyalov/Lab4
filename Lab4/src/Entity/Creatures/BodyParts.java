package Entity.Creatures;

public enum BodyParts {
    CHEEKS("щеки"),
    FOREHEAD("лоб"),
    EYES("глаза"),
    NOSE("нос"),
    EAR("ухо"),

    TOE("Пальчик");

    private String description;

    private BodyParts(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
