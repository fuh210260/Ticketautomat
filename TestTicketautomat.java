
/**
 * test for Ticketautomat
 * 
 * @author Rene Fuhry
 */
public class TestTicketautomat {
    public void test1() {
        Ticketautomat ticketautomat1 = new Ticketautomat(5);
        
        ticketautomat1.geldEinwerfen(2);
        ticketautomat1.geldEinwerfen(2);
        ticketautomat1.geldEinwerfen(2);
        ticketautomat1.ticketDrucken();
        ticketautomat1.returnMoney();
    }
    
    public void test2() {
        Ticketautomat ticketautomat1 = new Ticketautomat(5);
        
        ticketautomat1.geldEinwerfen(2);
        ticketautomat1.geldEinwerfen(2);
        ticketautomat1.ticketDrucken();
    }
}
