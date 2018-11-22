package com.supermap.layout;

import java.awt.*;

/*
* 封装好的用于设置GridBagConstraints的属性
* */
public class GBC extends GridBagConstraints{


    //带有坐标的构造方法
    public GBC(int gridx, int gridy){
        this.gridx = gridx;
        this.gridy = gridy;
    }

    //带有坐标和大小的构造方法
    GBC(int gridx, int gridy, int gridWidth, int gridHeight){
        this.gridx = gridx;
        this.gridy = gridy;
        this.gridwidth = gridWidth;
        this.gridheight = gridHeight;
    }

    //设置组件的填充方式
    public GBC setFill(int fill){
        this.fill = fill;
        return this;
    }

    //设置组件大小变化时的权重
    public GBC setWeight(int weightx, int weighty){
        this.weightx = weightx;
        this.weighty = weighty;
        return this;
    }

    //设置组件的外部填充  一个参数时的填充
    public GBC setInsets(int distance){
        this.insets = new Insets(distance, distance, distance, distance);
        return this;
    }

    //四个参数时的填充
    public GBC setInsets(int top, int left, int bottom, int right){
        this.insets = new Insets(top, left, bottom, right);
        return this;
    }
    
    //设置组件的内距
    public GBC setIpad(int ipadx, int ipady){
        this.ipadx = ipadx;
        this.ipady = ipady;
        return this;
    }
}