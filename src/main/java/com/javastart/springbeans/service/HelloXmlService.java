package com.javastart.springbeans.service;

public class HelloXmlService {

    private UtilsService utilsService;

    public String hello() {
        return utilsService.append("Хаю хай");
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}
