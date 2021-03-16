package com.company.schmidt;

public class Main {

    public static void main(String[] args) {

        collection info1= new collection();

        contactInfo contact1 = new contactInfo("Gunnar", "GunnarGunnar@gunnar.com");
        contactInfo contact2 = new contactInfo("idkwhattoputhere", "idk.com");
        contactInfo contact3 = new contactInfo("Mr.K","mrkisamazinggggg@hotmail.net");


        info1.addInfo(contact1);
        info1.addInfo(contact2);
        info1.addInfo(contact3);
        info1.sendAll();

        /* idk if this is even right, i was told by alec that you may exempt this so this is my best shot!!
         */
    }
}
