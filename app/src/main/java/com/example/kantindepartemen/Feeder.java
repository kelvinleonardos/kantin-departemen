package com.example.kantindepartemen;

import java.util.ArrayList;

public class Feeder {

    public static ArrayList<Table> getTables() {
        ArrayList<Table> tables = new ArrayList<>();
        tables.add(new Table(1, false));
        tables.add(new Table(2, false));
        tables.add(new Table(3, false));
        tables.add(new Table(4, false));
        tables.add(new Table(5, false));
        tables.add(new Table(6, false));
        tables.add(new Table(7, false));
        tables.add(new Table(8, false));
        tables.add(new Table(9, false));
        tables.add(new Table(10, false));
        return tables;
    }

    public static ArrayList<Menu> getMenus() {
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(new Menu("Nasi Goreng", 15000, "Nasi goreng spesial dengan telur mata sapi"));
        menus.add(new Menu("Mie Goreng", 12000, "Mie goreng spesial dengan telur dan ayam"));
        menus.add(new Menu("Ayam Goreng", 10000, "Ayam goreng spesial dengan sambal"));
        menus.add(new Menu("Ayam Bakar", 15000, "Ayam bakar spesial dengan sambal"));
        menus.add(new Menu("Ayam Geprek", 12000, "Ayam geprek spesial dengan sambal"));
        menus.add(new Menu("Sate Ayam", 15000, "Sate ayam spesial dengan bumbu kacang"));
        menus.add(new Menu("Sate Kambing", 20000, "Sate kambing spesial dengan bumbu kacang"));
        menus.add(new Menu("Soto Ayam", 10000, "Soto ayam spesial dengan bumbu kacang"));
        menus.add(new Menu("Bakso", 10000, "Bakso spesial dengan kuah dan mie"));
        menus.add(new Menu("Mie Ayam", 10000, "Mie ayam spesial dengan kuah"));
        return menus;
    }

}
