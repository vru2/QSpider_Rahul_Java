package Advance_Java;

public class instagram {

    private int pwd = 12345;
    private int Mno = 123456789;
    private String email = "abc@gmail.com";

    public int getpwd(){
        return pwd;
    }

    public int getMno(){
        return Mno;
    }

    public String getemail(){
        return email;
    }

    public void setpwd(int pwd){
        this.pwd=pwd;
    }

    public void setMno(int Mno){
        this.Mno=Mno;
    }

    public void setemail(String email){
        this.email=email;
    }
}
