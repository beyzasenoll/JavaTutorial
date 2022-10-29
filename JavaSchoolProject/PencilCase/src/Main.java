public class Main {
    public static void main(String[] args) {
       Pencils pencils=new Pencils(20);
       pencils.openLid();
       pencils.addPencil(15);
       pencils.addPencil(6);
       pencils.removePencil(5);
       pencils.removePencil(13);
    }
}