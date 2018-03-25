package com.example.android.egasilvanaa_1202154306_modul5;

public class AddData {
    //deklarasi variable
    String name, desc, priority;

    //konstruktor
    public AddData(String todo, String desc, String prior){
        this.name=todo;
        this.desc=desc;
        this.priority=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return name;
    }

    public void setTodo(String todo) {
        this.name = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return priority;
    }

    public void setPrior(String prior) {
        this.priority = prior;
    }
}
