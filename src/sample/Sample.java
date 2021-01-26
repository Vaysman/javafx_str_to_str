package sample;

public class Sample {
    private Controller controller; // объявляем объект класса Controller, который создала нам IDE
    private Main main;
    public String str="3";
    public  Sample(Controller controller){
        this.controller = controller;
    }

    public Sample(Main main) {
        this.main=main;
    }

    public String getStr(){

        return str;
    }

    public void setStr(String s){
        str=s;
    }
    public void print(){
        controller.strs=main.getSTRING();
      //  controller.strs="класс 2";

    }

}
