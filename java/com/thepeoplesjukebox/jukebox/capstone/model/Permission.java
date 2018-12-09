package com.thepeoplesjukebox.jukebox.capstone.model;

import com.thepeoplesjukebox.jukebox.json.JSONObject;

/**
 * Value Object for Permission using TPJ API 
 *
 * @author  Dixie
 */
public class Permission extends Object
{

    public int    permissionId   =0;
    public String permissionName ="";
    
    /**
     * Construct a Permission from a JSONObject.
     *
     * @param json
     *            A JSONObject.
     */
    public Permission(JSONObject json)
    {
        permissionId   = json.getInt("permissionId");
        permissionName = json.getString("permissionName");
    }

    public Permission()
    {

    }
}
