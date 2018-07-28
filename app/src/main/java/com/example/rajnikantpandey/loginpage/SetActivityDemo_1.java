package com.example.rajnikantpandey.loginpage;

/**
 * Created by Rajnikant Pandey on 3/14/2018.
 */

class SetActivityDemo_1 {
    String st1,st2,st3,st4;
    private static final SetActivityDemo_1 ourInstance = new SetActivityDemo_1();

    static SetActivityDemo_1 getInstance() {
        return ourInstance;
    }

    private SetActivityDemo_1() {
    }
    public void updateinfo(String st_1,String st_2,String st_3)
    {
        this.st1=st_1;
        this.st2=st_2;
        this.st3=st_3;
        this.st4="\n\n"+st_2+"\n"+st_3;

       // FifthFragment ft=new FifthFragment();
      //  ft.update(st_1,st_2,st_3);
    }
}
