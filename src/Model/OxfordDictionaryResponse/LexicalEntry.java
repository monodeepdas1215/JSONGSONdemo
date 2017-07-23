package Model.OxfordDictionaryResponse;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LexicalEntry {

    @SerializedName("entries")
    @Expose
    private List<Entry> entries = null;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("lexicalCategory")
    @Expose
    private String lexicalCategory;
    @SerializedName("pronunciations")
    @Expose
    private ArrayList<Pronunciation> pronunciations;
    @SerializedName("text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     *
     */
    public LexicalEntry() {
    }

    /**
     *
     * @param text
     * @param entries
     * @param language
     * @param lexicalCategory
     */
    public LexicalEntry(List<Entry> entries, String language, String lexicalCategory,ArrayList<Pronunciation> pronunciation, String text) {
        super();
        this.entries = entries;
        this.language = language;
        this.lexicalCategory = lexicalCategory;
        this.pronunciations=pronunciation;
        this.text = text;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLexicalCategory() {
        return lexicalCategory;
    }

    public void setLexicalCategory(String lexicalCategory) {
        this.lexicalCategory = lexicalCategory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Pronunciation> getPronunciations() {
        return pronunciations;
    }
    public void setPronunciations(ArrayList<Pronunciation> pronunciations) {
        this.pronunciations = pronunciations;
    }
}