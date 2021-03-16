package com.company.schmidt;

import java.util.*;

public class collection {
    private ArrayList<contactInfo> info =new ArrayList<contactInfo>();
    
    public collection() {
        ArrayList<contactInfo> info1 =new ArrayList<contactInfo>();
    }
    public void addInfo(contactInfo info){
        this.info.add(info);
    }
    public void sendAll(){
        for (contactInfo item : this.info){
            System.out.println(item.toString());
        }
    }
}