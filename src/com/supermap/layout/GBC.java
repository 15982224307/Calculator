package com.supermap.layout;

import java.awt.*;


public class GBC extends GridBagConstraints{


    public GBC(int gridx, int gridy){
        this.gridx = gridx;
        this.gridy = gridy;
    }

    GBC(int gridx, int gridy, int gridWidth, int gridHeight){
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridWidth;
        this.gridheight = gridHeight;
    }


    public GBC setFill(int fill){
        this.fill = fill;
        return this;
    }

    
    public GBC setWeight(int weightx, int weighty){
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    
    public GBC setInsets(int distance){
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    
    public GBC setInsets(int top, int left, int bottom, int right){
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }
    

    public GBC setIpad(int ipadx, int ipady){
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
}