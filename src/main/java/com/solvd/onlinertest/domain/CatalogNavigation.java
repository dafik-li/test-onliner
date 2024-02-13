package com.solvd.onlinertest.domain;

public enum CatalogNavigation {
    PRIME("Onlíner Prime"),
    ELECTRONICS("Электроника"),
    COMPUTERS("Компьютеры и сети"),
    TECHNIQUE("Бытовая техника"),
    EVERY_DAY("На каждый день"),
    CONSTRUCTION_AND_REPAIR("Стройка и ремонт"),
    HOME_ADN_GARDEN("Дом и сад"),
    AUTO_AND_MOTO("Авто и мото"),
    BEAUTY_AND_SPORT("Красота и спорт"),
    CHILD_AND_MOM("Детям и мамам");

    private final String name;

    CatalogNavigation(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
