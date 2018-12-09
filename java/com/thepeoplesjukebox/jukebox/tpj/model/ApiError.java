package com.thepeoplesjukebox.jukebox.tpj.model;

import java.lang.*;
import com.thepeoplesjukebox.jukebox.json.*;

/**
 * Value Object for ApiError using TPJ API 
 *
 * @author  Dixie
 */
public class ApiError extends Object
{

    public String errorCode     ="";
    public String errorMessage  ="";
    
    /**
     * Construct a ApiError from a JSONObject.
     *
     * @param json
     *            A JSONObject.
     */
    public ApiError(JSONObject json)
    {
        errorCode     = json.getString("errorCode");
        errorMessage  = json.getString("errorMessage");
    }

    public ApiError()
    {

    }
}
