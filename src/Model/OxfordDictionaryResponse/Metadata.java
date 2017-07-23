package Model.OxfordDictionaryResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("provider")
    @Expose
    private String provider;

    /**
     * No args constructor for use in serialization
     *
     */
    public Metadata() {
    }

    /**
     *
     * @param provider
     */
    public Metadata(String provider) {
        super();
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}