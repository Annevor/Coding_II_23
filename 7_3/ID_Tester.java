public class ID_Tester {
    public static void main(String[] args) {
        ID_Num id1 = new ID_Num();
        ID_Num id2 = new ID_Num("55-1234");
        ID_Num id3 = new ID_Num("76-4236");
        ID_Num id4 = id3;
        id4.setID("28-3497");
        ID_Num id5 = new ID_Num("98-2336");
        ID_Num id6 = new ID_Num(id5);
    }
}
