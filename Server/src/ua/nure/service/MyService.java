package ua.nure.service;

import ua.nure.parser.DOMParser;
import ua.nure.sportinventory.Inventory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

@WebService
public class MyService {
    private List<Inventory> inventories;

    public void parseXML() throws Exception {
        DOMParser parser = new DOMParser();
        inventories = parser.parse(new FileInputStream(new File("SportInventory.xml")));
    }

    @WebMethod
    public String doubleEcho(String st) {
        return st+st;
    }

    @WebMethod
    public String getIntentoryList() {
        StringBuilder sb = new StringBuilder();
        for (Inventory i : inventories) {
            sb.append(i).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @WebMethod
    public String getInventoryById(int i) {
        StringBuilder sb = new StringBuilder();
        for (Inventory inv : inventories) {
            if (inv.getId() == i) {
                return sb.append(inv).append(System.lineSeparator()).toString();
            }
        }
        return "Inventory with this id does not exist";
    }

    @WebMethod
    public String getPriceInHourById(int i) {
        StringBuilder sb = new StringBuilder();
        for (Inventory inv : inventories) {
            if (inv.getId() == i) {
                return sb.append(inv.getPriceInHour().getValue())
                        .append(" ")
                        .append(inv.getPriceInHour().getCurrency())
                        .append(System.lineSeparator()).toString();
            }
        }
        return "Inventory with this id does not exist";
    }

    @WebMethod
    public String getPriceInADayById(int i) {
        StringBuilder sb = new StringBuilder();
        for (Inventory inv : inventories) {
            if (inv.getId() == i) {
                return sb.append(inv.getPriceInADay().getValue())
                        .append(" ")
                        .append(inv.getPriceInADay().getCurrency())
                        .append(System.lineSeparator()).toString();
            }
        }
        return "Inventory with this id does not exist";
    }

    @WebMethod
    public String getYearInADayById(int i) {
        StringBuilder sb = new StringBuilder();
        for (Inventory inv : inventories) {
            if (inv.getId() == i) {
                return sb.append(inv.getYear())
                        .append(System.lineSeparator()).toString();
            }
        }
        return "Inventory with this id does not exist";
    }
}
