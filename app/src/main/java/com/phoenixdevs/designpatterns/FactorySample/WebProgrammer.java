package com.phoenixdevs.designpatterns.FactorySample;

public class WebProgrammer extends Programmer {
    private String name;
    private String family;
    private String resume;

    public WebProgrammer() {

    }

    public WebProgrammer(String name, String family, String resume) {
        this.name = name;
        this.family = family;
        this.resume = resume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }





    @Override
    public String getname() {
        return name;
    }

    @Override
    public String getfamily() {
        return family;
    }

    @Override
    public String getResume() {
        return resume;
    }


}
