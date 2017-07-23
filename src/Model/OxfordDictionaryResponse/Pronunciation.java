package Model.OxfordDictionaryResponse;

import java.util.ArrayList;

/**
 * Created by monodeep on 23/7/17.
 */
public class Pronunciation
{
    private String audioFile;
    private ArrayList<String> dialects;
    private String phoneticNotation;
    private String phoneticSpelling;

    public Pronunciation(String a,ArrayList<String> d,String pN,String pS){
        audioFile=a;
        dialects=d;
        phoneticNotation=pN;
        phoneticSpelling=pS;
    }

    public ArrayList<String> getDialects() {
        return dialects;
    }

    public void setDialects(ArrayList<String> dialects) {
        this.dialects = dialects;
    }

    public String getAudioFile() {
        return audioFile;
    }

    public void setAudioFile(String audioFile) {
        this.audioFile = audioFile;
    }

    public String getPhoneticNotation() {
        return phoneticNotation;
    }

    public String getPhoneticSpelling() {
        return phoneticSpelling;
    }

    public void setPhoneticNotation(String phoneticNotation) {
        this.phoneticNotation = phoneticNotation;
    }

    public void setPhoneticSpelling(String phoneticSpelling) {
        this.phoneticSpelling = phoneticSpelling;
    }
}
