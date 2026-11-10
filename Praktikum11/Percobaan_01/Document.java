package Praktikum11.Percobaan_01;

import Praktikum11.percobaan_02.Printable;

public class Document implements Printable {
    public String fileName;
    public String content;

    @Override
    public String getPrintableContent() {
        return content;
    }
}
