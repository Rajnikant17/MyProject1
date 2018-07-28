package com.example.rajnikantpandey.loginpage;

/**
 * Created by Rajnikant Pandey on 2/16/2018.
 */
public class FragOneDataProvidr
{
    int image;
    String number;

    public FragOneDataProvidr(int img,String number)
    {
      this.setImage(img);
      this.setNumber(number);
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {

        return number;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {

        return image;
    }

}
