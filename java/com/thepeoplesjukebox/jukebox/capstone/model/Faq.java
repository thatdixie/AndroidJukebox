package com.thepeoplesjukebox.jukebox.capstone.model;

import com.thepeoplesjukebox.jukebox.json.JSONObject;

/**
 * Value Object for Faq using TPJ API 
 *
 * @author  Dixie
 */
public class Faq extends Object
{

    public int    faqId       =0;
    public String faqQuestion ="";
    public String faqAnswer   ="";
    public int    faqOrder    =0;
    public String faqCreated  ="";
    public String faqModified ="";
    public String faqStatus   ="";

    
    /**
     * Construct a Faq from a JSONObject.
     *
     * @param json
     *            A JSONObject.
     */
    public Faq(JSONObject json)
    {
        faqId       = json.getInt("faqId");
        faqQuestion = json.getString("faqQuestion");
        faqAnswer   = json.getString("faqAnswer");
        faqOrder    = json.getInt("faqOrder");
        faqCreated  = json.getString("faqCreated");
        faqModified = json.getString("faqModified");
        faqStatus   = json.getString("faqStatus");
    }

    public Faq()
    {

    }
}
