/**
 * Ein Ticketautomat, der Tickets zu einem bestimmten Preis ausdruckt.
 * Man kann 1€ oder 2€ einwerfen. Ein Ticket wird nur gedruckt, wenn 
 * (seit dem letzten Druck) genug Geld eingeworfen wurde. Der Automat
 * merkt sich, wieviel Geld insgesamt schon eingeworfen wurde.
 *
 * @author D.J. Barnes, M. Kölling (adaptiert: H. Moritsch 2019-10-16)
 */
public class Ticketautomat
{
    // Preis eines Tickets
    private int preis;

    // Geldbetrag, der seit dem letzten Ausdruck eingeworfen wurde
    private int bisherGezahlt;

    // Geldsumme, die bisher insgesamt eingeworfen wurde
    private int gesamtsumme;

    /**
     * Erzeuge einen Ticketautomaten für einen bestimmten Ticketpreis.
     */
    public Ticketautomat(int ticketpreis)
    {
        setPreis(ticketpreis);
        setBisherGezahlt(0); 
        setGesamtsumme(0);
    }

    public int getPreis()
    {
        return preis;
    }

    public void setPreis(int preisNeu)
    {
        if (preisNeu > 0)
        {
            preis = preisNeu;
        }
        else
        {
            System.out.println("Preis muss positiv sein");
        }
    }

    public int getBisherGezahlt()
    {
        return bisherGezahlt;
    }

    public void setBisherGezahlt(int bisherGezahltNeu)
    {
        if (bisherGezahltNeu >= 0)
        {
            bisherGezahlt = bisherGezahltNeu;
        }
        else
        {
            System.out.println("Bisher gezahlter Betrag muss positiv sein");
        }
    }

    public int getGesamtsumme()
    {
        return gesamtsumme;
    }

    public void setGesamtsumme(int gesamtsummeNeu)
    {
        if (gesamtsummeNeu >= 0)
        {
            gesamtsumme = gesamtsummeNeu;
        }
        else
        {
            System.out.println("Gesamtsumme muss positiv sein");
        }
    }

    /**
     * Nimm einen Betrag als Anzahlung für das nächste Ticket. 
     */
    public void geldEinwerfen(int betrag)
    {
        // UND: &&
        // ODER: ||
        if (betrag == 1 || betrag == 2)  // if (betrag >= 1 && betrag <=2 ) 
        {
            setBisherGezahlt(bisherGezahlt + betrag);
        }
        else 
        {
            System.out.println("Betrag muss 1€ oder 2€ sein (" + betrag + "€)");
        }
    }

    /**
     * Drucke ein Ticket, falls genüend Geld eingeworfen wurde. 
     * Ziehe den Ticketpreis vom bisher gezahlten Betrag ab.
     * Fehlermeldung, falls noch Geld für ein Ticket fehlt.
     */
    public void ticketDrucken()
    {
        if(bisherGezahlt >= preis)
        {
            // Ausdruck eines Tickets simulieren
            System.out.println("###############");
            System.out.println("# BlueJ-Linie #");
            System.out.println("#    Ticket   #");
            System.out.println("#    " + preis + " Euro   #");
            System.out.println("###############");
            System.out.println();

            // Gesamtsumme um den Ticketpreis erhöhen
            setGesamtsumme(gesamtsumme + preis);

            // Preis vom bisher Bezahlten abziehen.
            setBisherGezahlt(bisherGezahlt - preis);
        }
        else {
            System.out.println("Not enough Money (" + bisherGezahlt + "€)");
            System.out.println("Ticketpreis = " + preis + "€");
        }
    }
    
    /**
     * defining local variable, to remember bisherGezahlt
     * the variable restgeld only exits inside returnMoney()
     */
    public int returnMoney() {
        int restgeld;
        
        restgeld = bisherGezahlt;
        
        setBisherGezahlt(0);
        
        System.out.println(restgeld + "€ returned");
        return restgeld;
    }
}
