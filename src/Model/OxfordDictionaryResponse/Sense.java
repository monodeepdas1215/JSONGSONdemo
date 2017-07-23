package Model.OxfordDictionaryResponse;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sense {

    @SerializedName("definitions")
    @Expose
    private List<String> definitions = null;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("subsenses")
    @Expose
    private List<Subsense> subsenses = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Sense() {
    }

    /**
     *
     * @param id
     * @param definitions
     * @param subsenses
     */
    public Sense(List<String> definitions, String id, List<Subsense> subsenses) {
        super();
        this.definitions = definitions;
        this.id = id;
        this.subsenses = subsenses;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Subsense> getSubsenses() {
        return subsenses;
    }

    public void setSubsenses(List<Subsense> subsenses) {
        this.subsenses = subsenses;
    }
}