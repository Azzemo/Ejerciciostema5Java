import interfaces.CocheCRUD;

public class ClaseMain {
    public static void main(String[] args) {
        
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        System.out.println(cocheCrud);
    }
    
}
